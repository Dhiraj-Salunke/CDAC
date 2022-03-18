class homework
{
	
	static int a=15;
	static int c=19;
	int  b=20;
	
  static void display()              /// we cannot use instance  variable in static functions. for using we have to use static variables 
		{
			System.out.println("for a  static ->");
			System.out.println("Instance variable A="+a);
			System.out.println("User"+c);
		}
		
	void nonstatic()
	    {
			System.out.println("for a non static ->");
			System.out.println("Instance variable A="+a);
			System.out.println("User id2="+b);
		
	    }	
		public static void main(String args[])
		{
			
		 display();
		 homework c1=new homework();
		 c1.nonstatic();
		}
}