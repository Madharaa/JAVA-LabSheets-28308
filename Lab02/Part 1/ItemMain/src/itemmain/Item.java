package itemmain;
public class Item
{
    private int location;
    private String description;
    
    public Item(int loc,String des)
    {
        location=loc;
        description=des;
    }
    public void setlocation(int loc)
    {
        location=loc;
    }
    public int getlocation()
    {
        return location;
    }
    public void setdescription(String des)
    {
        description=des;
    }
    public String getdescription()
    {
        return description;
    }
}
