class A88 
{
	static int i=test();
	static int test()
	{
		main(null);
		System.out.println("test:"+i);
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		i=10;
	}
}
