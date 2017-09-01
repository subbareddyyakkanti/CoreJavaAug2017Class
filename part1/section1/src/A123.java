class A123 
{
	static int i;
	static int j=10;
	static 
	{
		System.out.println("A123-SIB");
	}
	static void test()
	{
		System.out.println("from test");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
