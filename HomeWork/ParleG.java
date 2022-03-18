class ParleG {

    int Id;
    String name;
    Double sal;
    static String department="Field";

    void setdata(int empId,String empname,Double empsal)
    {
        Id = empId;
        name = empname;
        sal = empsal;
        
    }

    void getdata()
    {
        System.out.println("Employee Id=" +Id);
        System.out.println("Employee Name=" +name);
        System.out.println("Employee Salary=" +sal);
        System.out.println("Employee Department=" +department);
    }

    public static void main(String args[])
    {
        ParleG e1=new ParleG();
        ParleG e2=new ParleG();
        ParleG e3=new ParleG();

        e1.setdata(10,"Luffy", 30000.0);
        e1.getdata();

        System.out.println();

        e1.setdata(11,"Zoro", 20000.0);
        e1.getdata();

        System.out.println();

        e1.setdata(12,"Sanji", 10000.0);
        e1.getdata();

    }

}