class A120a 
{
	static void test()
	{
		System.out.println("from test");
	}
	static
	{
		System.out.println("A120a-SIB");
	}
}
class A120
{
	public static void main(String[] args) 
	{
		System.out.println("---111---");
		A120a.test();
		System.out.println("----222----");
		A120a.test();
		System.out.println("-----333---");
        A120a.test();
		System.out.println("-----444----");
	}
	static 
	{
		System.out.println("A120-SIB");
	}
}
