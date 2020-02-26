package service;

import exception.WrongArgumentException;
import java.util.Map;
import java.util.TreeMap;

public class Matrix {

    public char[][] convertStringToMatrix(String string) {
        int n = (int) Math.sqrt(string.length());
        if (n - Math.sqrt(string.length()) != 0) {
            throw new WrongArgumentException("the length of the string should be"
                    + "a perfect square number");
        }
        int index = 0;
        char[][] matrix = new char[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = string.toUpperCase().charAt(index++);
            }
        }
        return matrix;
    }

    public String describeWordByMatrix(char[][] matrix, String word) {
        Map<Integer, String> map = new TreeMap<>();
        int index;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                index = word.toUpperCase().indexOf(matrix[i][j]);
                if (index == -1) {
                    continue;
                }
                if (index == word.length() - 1) {
                    map.put(index, "[" + i + "," + j + "]");
                } else {
                    map.put(index, "[" + i + "," + j + "]->");
                }
            }
        }
        if (map.size() != word.length() || map.size() == 0) {
            throw new WrongArgumentException("matrix should contain all word's characters");
        }
        StringBuilder result = new StringBuilder();
        for (String s : map.values()) {
            result.append(s);
        }
        return result.toString();
    }
}
