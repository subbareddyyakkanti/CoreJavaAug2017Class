abstract class B33a
{
	abstract void test1();
	abstract void test2();
	abstract void test3();

}
class B33 extends B33a
{
	void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
	void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String ar[])
	{
		//B33a a1=new B33a();
		B33 b1=new B33();
		b1.test1();
		b1.test2();
		b1.test3();
		System.out.println("done");
	}
}