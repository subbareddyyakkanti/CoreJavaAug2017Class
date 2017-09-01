class A188A 
{
	static
	{
		System.out.println("A188A-SIB");
	}
	static void test()
	{
		System.out.println("A188A-test");
	}
}
class A188B extends A188A
{
	static
	{
		System.out.println("A188B-SIB");
	}
	
}
class A188
{

	public static void main(String[] args) 
	{
		System.out.println("---11----");
		A188B.test();
		System.out.println("----22----");

	}
}
