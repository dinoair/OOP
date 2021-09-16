public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        try {
            if ((width <= 0) || (length <= 0) )
                throw new ShapeException();
        } catch (ShapeException e) {
            System.out.println("Exception: " + e.toString());
            return;
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }


}