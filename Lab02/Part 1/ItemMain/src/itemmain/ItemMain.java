package itemmain;
public class ItemMain
{
    public static void main(String[] args)
    {
        Item i1=new Item(45,"malabe");
        i1.setlocation(45);
        i1.setdescription("malabe");
        System.out.println("Location is "+i1.getlocation());
        System.out.println("Description is "+i1.getdescription());
    }
    
}
