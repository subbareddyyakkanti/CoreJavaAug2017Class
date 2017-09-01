class B84a
{
	void test()
	{
		System.out.println("from B84a");
	}
}
class B84 extends B84a
{
	public static void main(String ar[])
	{
		B84 b=new B84();
		b.test();
		System.out.println("done");
	}
}