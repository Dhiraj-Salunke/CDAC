 import java.util.*;
 
 class Employee1 
{
    int No = 10;
    static int Id=7;

    void display()
    {
        System.out.println(No);
        System.out.println(Id);
        System.out.println();
    }

    public static void main(String args[])
    {
        Employee1 e1=new Employee1();
        Employee1 e2=new Employee1();
        Employee1 e3=new Employee1();
        e1.display();

        e2.Id=4;
        e2.No=20;
        e3.Id=12;

        e2.display();
        e3.display();
        e1.display();
        
        
    }


}