package main;
class Circle extends Shape
{
    private double r;
    public Circle(double r)
    {
        this.r=r;
    }
    @Override
    public void caculateArea()
    {
        return Math.PI * r * r;
    }
}
