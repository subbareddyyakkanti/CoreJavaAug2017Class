class A124a 
{
	static int i;
	static 
	{
		i=10;
		System.out.println("A124a-SIB");
	}
	static void test()
	{
		System.out.println("A124a-test");
	}
}
class A124
{
   static
	{
	   System.out.println("A124-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println(1);
		A124a.test();
		System.out.println(2);
		System.out.println(A124a.i);
	}
}
