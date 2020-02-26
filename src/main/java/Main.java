import service.Matrix;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        char[][] result = matrix.convertStringToMatrix(args[0]);
        System.out.println(matrix.describeWordByMatrix(result, args[1]));
    }
}
