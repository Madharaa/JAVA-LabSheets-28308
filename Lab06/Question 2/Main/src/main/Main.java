package main;
public class Main
{
    public static void main(String[] args)
    {
        Speaker Politician = new Politician();
        Speaker Priest = new Priest();
        Speaker Lecturer = new Lecturer();
        
        System.out.println("Politician speaking");
        Politician.speak();
        
        System.out.println("\nPriest speaking");
        Priest.speak();
        
        System.out.println("Lecturer speaking");
        Lecturer.speak();
        

    }
    
}
