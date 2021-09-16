class ShapeException extends Exception
{
    // override toString() method describing the exception
    public String toString()
    {
        return "Error. Bad side.";
    }
}
public abstract class Shape {
    public abstract double area();
}
