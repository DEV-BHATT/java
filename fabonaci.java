import java.util.Scanner;
class fabonaci
{
	public static void main(String[] args)
	{
	int a=0,b=1,c=0,n,i=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number febonaci series");
	n=input.nextInt();
	while(i<n)
	{
	a=b;
	b=c;
	c=a+b;
i++;
	}
	System.out.println("Print the fabonaci "+c);
	}
}
	