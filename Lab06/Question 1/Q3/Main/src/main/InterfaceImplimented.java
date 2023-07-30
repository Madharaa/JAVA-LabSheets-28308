package main;
public class InterfaceImplimented implements MyFirstInterface
{
    @Override
    public void display()
    {
        System.out.println("Value of x: "+x);
    }
}
