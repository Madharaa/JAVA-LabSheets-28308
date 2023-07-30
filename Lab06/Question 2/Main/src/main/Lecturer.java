package main;
public class Lecturer implements Speaker
{
     @Override
    public void speak()
    {
        System.out.println("Lecturer: we are going to discuss constructors");
    }
}
