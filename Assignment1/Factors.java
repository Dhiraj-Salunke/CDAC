import java.util.*;

public class Factors
 {

    public static void main(String[] args) {
  
      int number;

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter the Number:");
      number=sc.nextInt();
  
      System.out.print("Factors of " + number + " are: ");
  
     
      for (int i = 1; i <= number; ++i)
       {
  
        if (number % i == 0)
         {
          System.out.print(i + " ");

         }
      }
    }
  }