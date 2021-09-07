import java.util.Scanner;
class collage
{
	void input()
	{
		System.out.println("Print the First class");
	}
}
class Second extends collage
{
	void get()
	{
	System.out.println("Print the Second class");
	}
}
class Third extends Second
{ 
	Result()
	{
	System.out.println("Print the new Class");
	}


	public static void main(String [] args)
	{
	Third sc=new Thrid();
	sc.input();
	sc.get();
	sc.Result();
	}
}