import service.MatrixService;

public class Main {

    public static void main(String[] args) {
        MatrixService matrix = new MatrixService();
        char[][] result = matrix.convertStringToMatrix("SINPRGAIB");
        System.out.println(matrix.describeWordByMatrix(result, "spring"));
    }
}
