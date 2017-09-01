class B98a
{
	void test1()
	{
		System.out.println("from B98a-test1");
	}
	void test2()
	{
		System.out.println("from B98a-test2");
	}
}
class B98 extends B98a
{
	void test3()
	{
		super.test1();
		super.test2();
		test1();
		test2();
	}
	void test2()
	{
		System.out.println("from B98-test2");
	}
	public static void main(String ar[])
	{
		B98 b=new B98();
		b.test3();
		System.out.println("done");
	}
}
