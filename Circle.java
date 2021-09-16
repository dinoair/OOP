public class Circle extends Shape {
    private double radius;
    public static final double Pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        try {
            if (radius <= 0 )
                throw new ShapeException();
        } catch (ShapeException e) {
            System.out.println("Exception: " + e.toString());
            return;
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Pi * Math.pow(radius, 2);
    }
}