abstract class B40a
{
	B40a(int i)
	{
		System.out.println("B40a(int)");
	}
	abstract void test1();

}
abstract class B40b extends B40a
{
	B40b()
	{
		super(90);
		System.out.println("B40b()");
	}

}
class B40 extends B40b
{
	B40()
	{
		System.out.println("B40()");
	}
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String ar[])
	{
		B40 b2=new B40();
		System.out.println("----");
		b2.test1();
	}
}