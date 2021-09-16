import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void test1() throws Exception{
        Rectangle rectangle =  new Rectangle(42, 10);
        double s = rectangle.area();
        Assertions.assertEquals(s, 42 * 10);
    }
    @Test
    public void test2() throws Exception{
        Rectangle rectangle =  new Rectangle(42, -10);
        double s = rectangle.area();
        Assertions.assertEquals(s, 0);
    }
    @Test
    public void test3() throws Exception{
        Rectangle rectangle =  new Rectangle(42, 0);
        double s = rectangle.area();
        Assertions.assertEquals(s, 0);
    }
}