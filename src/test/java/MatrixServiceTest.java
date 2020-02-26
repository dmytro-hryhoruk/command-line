import exception.WrongArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.MatrixService;

public class MatrixServiceTest {
    private static final String MATRIX = "ABCDEFGHI";
    private MatrixService matrix;

    @Before
    public void setMatrix() {
        matrix = new MatrixService();
    }

    @Test(expected = WrongArgumentException.class)
    public void wrongLengthTest() {
        matrix.convertStringToMatrix("abcde");
    }

    @Test
    public void matrixLengthTest() {
        char[][] array = matrix.convertStringToMatrix(MATRIX);
        Assert.assertEquals(array.length, array[0].length);
    }

    @Test(expected = WrongArgumentException.class)
    public void undescribableWordTest() {
        char[][] array = matrix.convertStringToMatrix(MATRIX);
        matrix.describeWordByMatrix(array, "kkk");
    }

    @Test
    public void describeWordByMatrixTest() {
        char[][] array = matrix.convertStringToMatrix(MATRIX);
        String description = matrix.describeWordByMatrix(array, "bEd");
        Assert.assertEquals("[0,1]->[1,1]->[1,0]", description);
    }
}