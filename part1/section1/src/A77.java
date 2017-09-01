class A77 
{
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		test();
		A77.test();
		System.out.println("done");
	}
}
