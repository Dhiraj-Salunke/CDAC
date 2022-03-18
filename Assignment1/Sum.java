import java.util.*;

public class Sum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;

        System.out.println("Enter First number");
        a=sc.nextInt();

        System.out.println("Enter Second number");
        b=sc.nextInt();

        sum = a+b;
        System.out.println("Sum ="+sum);
    }

}