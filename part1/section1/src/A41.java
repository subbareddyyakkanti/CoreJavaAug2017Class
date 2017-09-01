class A41 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	static void test1()
	{
		System.out.println(3);
		test2();
	}
	static void test2()
	{
		System.out.println(4);
	}
}
