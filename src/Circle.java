public class Circle
{
    static double PI = 3.14159;
    int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public double circumference()
    {
        return 2 * PI * radius;
    }
    public void enlarge(int factor)
    {
        radius = radius * factor;
    }
}
