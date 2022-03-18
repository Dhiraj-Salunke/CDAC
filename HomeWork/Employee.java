 import java.util.*;
 
 class Employee 
{
    int No = 10;
    static int Id=7;

    void display()
    {
        System.out.println(No);
        System.out.println(Id);
    }

    public static void main(String args[])
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.display();

        e2.Id=4;
        e2.display();
        e1.display();
        
        
    }


}