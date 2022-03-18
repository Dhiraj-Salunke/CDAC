import java.util.*;

class Largest 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Enter the numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        if(n1>=n2 && n1>=n3)
        {
            System.out.println("Largest number is " +n1);
        }
        else if(n2>=n1 && n2>=n3)
        {
            System.out.println("Largest number is " +n2); 
        }
        else
        {
            System.out.println("Largest number is " +n3); 
        }

    }

}