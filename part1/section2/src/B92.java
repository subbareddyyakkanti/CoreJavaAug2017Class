class B92a
{
	void test()
	{
		System.out.println("from B92a");
	}
}
class B92 extends B92a
{
	protected void test()
	{
		System.out.println("from B92");
	}
	public static void main(String ar[])
	{
		B92 b=new B92();
		b.test();
		System.out.println("done");
	}

}