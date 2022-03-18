import java.util.*;

public class OddSeries

{  
public static void main(String args[])   
  {

    int number;  
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number :");
    number= sc.nextInt();

    System.out.println("List of odd numbers from 1 to "+number+": ");
 
    for (int i=0; i<number; ++i)
    {  
        i+=1;
        System.out.print(i + " ");
    }  
  }  
}  