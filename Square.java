public class Square extends Shape {
    private double a;

    public Square() {
        this(1);
    }

    public Square(double a) {
        try {
            if (a <= 0)
                throw new ShapeException();
        } catch (ShapeException e) {
            System.out.println("Exception: " + e.toString());
            return;
        }
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}