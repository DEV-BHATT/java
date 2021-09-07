abstract class shape
{
	 abstract void get();
	}
class rectangle extends shape
{
	void draw()
	{
	System.out.println("Draw rectangle");
	}
}
	class triangle extends shape
{
	void draw()
	{
	System.out.println("Draw Triangle");
	}

	public static void main(String [] args)
	{
		shape sn=new rectangle();
		sn.draw();
		sn=new triangle();
		sn.draw();
	}
}
		



