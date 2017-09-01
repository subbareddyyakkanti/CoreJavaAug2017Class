interface B67a
{
	void test1();
}
interface B67b extends B67a
{
	void test2();
}
class B67 implements B67b
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String ar[])
	{
		B67 b1=new B67();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}