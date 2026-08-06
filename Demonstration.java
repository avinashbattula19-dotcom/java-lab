import java.util.Scanner;

class Demonstration
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System .out.println("enter values");
		int a =s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.printf("between %d and %d,max is %d",a,b,a);
		}
		else
		{
			System.out.printf("between %d and %d ,min is %d",a,b,a);
		}	
	}
}