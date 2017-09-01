class B85a
{
	void test()
	{
		System.out.println("from B85a");
	}
}
class B85 extends B85a
{
	void test()
	{
		System.out.println("from B85");
	}
	public static void main(String arg[])
	{
		B85 b=new B85();
		b.test();
	}
}