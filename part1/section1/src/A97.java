class A97 
{
	static int i;
	static void test()
	{
		System.out.println("from test");
		i=10;
	}
	public static void main(String[] args) 
	{
		System.out.println("a:"+i);
		test();
		System.out.println("b:"+i);
	}
}
