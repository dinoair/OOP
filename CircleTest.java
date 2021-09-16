import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void test1() throws Exception{
        Circle circle =  new Circle(42);
        double s = circle.area();
        Assertions.assertEquals(s, Math.PI * Math.pow(42,2));
    }

    @Test
    public void test2() throws Exception{
        Circle circle =  new Circle(-42);
        double s = circle.area();
        Assertions.assertEquals(s, 0);
    }
    @Test
    public void test3() throws Exception{
        Circle circle =  new Circle(0);
        double s = circle.area();
        Assertions.assertEquals(s, 0);
    }
}