abstract class Shape
{    int a,b;
    abstract void area();
}
class Rectangle extends Shape
{
    void area()
    {
        System.out.println("Area of rectangle:"+(a*b));
    }
}
class Triangle extends Shape
{
    void area()
    {
        System.out.println("Area of Triangle:"+(0.5*a*b));
    }
}
 public class Circle extends Shape
{
    void area()
    {
        System.out.println("Area of Cirle:"+(a*b));
    }
public static void main(String[] args)
{
    Rectangle r=new Rectangle();
    r.a=5;
    r.b=9;
    r.area();
    Triangle t=new Triangle();
    t.a=10;
    t.b=20;
    t.area();
    Circle c=new Circle();
    c.a=10;
    c.b=40;
    c.area();
}
}