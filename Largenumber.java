import java .util.Scanner;

class Largenumber
{
	public static void main(String [] args)
	{
	Scanner n=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the a number");
	a=n.nextInt();
	System.out.println("Enter the b number");
	b=n.nextInt();
	System.out.println("Enter the b number");
	c=n.nextInt();
	if(a>b)
	{
	System.out.println("Print the large"+a);
	}
	else if(b>c)
	{
	System.out.println("Print the large"+b);
	}
	else if(c>a)
	{
	System.out.println("Print the Large"+c);
	}
	else
	{
		System.out.println("Invaild option");
		}
	}
}
	