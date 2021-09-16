import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;

import java.security.spec.ECField;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void test1() throws Exception{
        Square square = new Square(42);
        double s = square.area();
        Assertions.assertEquals(s, 42 * 42);
    }

    @Test
    public void test2() throws Exception {
        Square square  = new Square(-42);
        double s = square.area();
        Assertions.assertEquals(s, 0);
    }

    @Test
    public void test3() throws Exception {
        Square square  = new Square(0);
        double s = square.area();
        Assertions.assertEquals(s, 0);
    }
}