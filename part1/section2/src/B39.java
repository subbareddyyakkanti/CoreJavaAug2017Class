abstract class B39a
{
	B39a()
	{
		System.out.println("B39a()");
	}
}
class B39 extends B39a
{
	B39()
	{
		System.out.println("B39()");
	}
	public static void main(String ar[])
	{
		B39 b1=new B39();
		System.out.println("done");
	}
}