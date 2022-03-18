class StaticPrg {

    int number1 = 10;
    static int number2 = 20;

    void display()
    {
        System.out.println("Instance number" +number1);
        System.out.println("Static number" +number2);
    }

    static void show()
    {
        //System.out.println("Instance number" +number1);
        System.out.println("Static number" +number2);
    }

    public static void main(String args[]){
        StaticPrg S = new StaticPrg();

        S.display();
        S.show();
    }



}