abstract class B34a
{
	abstract void test1();
	abstract void test2();
	void test3()
	{
		System.out.println("from test3");
	}
}
abstract class B34b extends B34a
{
	void test1()
	{
		System.out.println("from test1");
	}

}
class B34 extends B34b
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String ar[])
	{
		B34 b1=new B34();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}