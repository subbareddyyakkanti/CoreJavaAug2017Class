interface B53a
{
	void test1();
	int test2();
}
abstract class B53b implements B53a
{
	public void test1()
	{
		System.out.println("from test1");
	}
}
class B53 extends B53b
{
	public int test2()
	{
       System.out.println("from test2");
	   return 200;
	}
	public static void main(String ar[])
	{
		B53 b1=new B53();
		b1.test1();
		System.out.println(b1.test2());
	}
}
