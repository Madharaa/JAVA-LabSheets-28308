package javaapplication05;
public class JavaApplication05 
{

    public static void main(String[] args)
    {
        char A =0;
	char grade = A;
	 switch(grade)
	  {
	   case 'A' :
	   System.out.println("Excellent!"); 
	   break;
       	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);



       }
 }
    
 