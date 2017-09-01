class A121a
{
	static int i;
	static void test()
	{
		System.out.println("A121a.test:"+i);
	}
	static 
	{
		i=10;
		System.out.println("A121a.SIB");
	}
}
class A121
{
	static int i=30;
	static
	{
		System.out.println("A121.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		A121a.test();
		A121a.i=4;
		i=2;
		System.out.println(i);
		A121a.test();
		System.out.println("main end");
	}
}
