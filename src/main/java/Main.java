import service.MatrixService;

public class Main {

    public static void main(String[] args) {
        MatrixService matrix = new MatrixService();
        char[][] result = matrix.convertStringToMatrix(args[0]);
        System.out.println(matrix.describeWordByMatrix(result, args[1]));
    }
}
