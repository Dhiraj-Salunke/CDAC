import java.util.*;

public class sumofdigit 
{
    public static void main(String args[])
	{
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");  
		int n1=sc.nextInt();
		
		int res;
        int sum=0;
        
		while(n1>0)
		{
			res=n1%10;
			sum=sum+res;
			n1=n1/10;
        }

        System.out.println("Sum of digits: "+sum);  
        
    }
}