class B97a
{
	void test()
	{
		System.out.println("from B97a");
	}
}
class B97 extends B97a
{
	void test()
	{
		System.out.println("from B97");
		super.test();
		System.out.println("from B97");
	}
	public static void main(String ar[])
	{
		B97 b=new B97();
		b.test();
	}
}