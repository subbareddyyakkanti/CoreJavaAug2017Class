class B86a
{
	void test()
	{
		System.out.println("from B86a");
	}
}
class B86 extends B86a
{
	void test(int i)
	{
		System.out.println("from B86");
	}
	public static void main(String ar[])
	{
		B86 b=new B86();
		b.test();
	}
}