
class Book 
{
    String Title ="Think Like a Monk";
    String Author ="Jay Shetty";
    String Publisher ="Thorsons";
    int Pages =180;

    void display()
    {
        System.out.println("Book Title =" +Title);
        System.out.println("Book Author =" +Author);
        System.out.println("Book Publisher =" +Publisher);
        System.out.println("Book Pages =" +Pages);


    }
    public static void main(String args[])
    {
        Book B = new Book();

        B.display();


    }
    

}