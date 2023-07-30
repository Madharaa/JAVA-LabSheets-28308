package main;
public class CylindricalContainer extends Container
{
    private double h, r;
    final double pi = 3.14159;

    CylindricalContainer(double h, double r)
    {
    this.h = h;
    this.r = r;
    }

    @Override
    public double volume() 
    {
     return (pi * r * r * h);
    }
}
