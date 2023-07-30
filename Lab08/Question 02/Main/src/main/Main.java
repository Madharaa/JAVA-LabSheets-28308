package main;
public class Main
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(4, 8);
        Triangle t1 = new Triangle(5, 4, 6);

        System.out.println("Circle: Area = " + c1.calculateArea() + ", Perimeter = " + c1.calculatePerimeter());
        System.out.println("Rectangle: Area = " + r1.calculateArea() + ", Perimeter = " + r1.calculatePerimeter());
        System.out.println("Triangle: Area = " + t1.calculateArea() + ", Perimeter = " + t1.calculatePerimeter());
    

    }
    
}
