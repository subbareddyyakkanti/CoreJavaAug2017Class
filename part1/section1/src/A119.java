class A119a 
{
	static{
		System.out.println("A119a-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("A119a_main");
	}
}
class A119
{
	static {
		System.out.println("A119-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A119-main-begin");
		A119a.main(arg);
		System.out.println("A119-main-end");
	}
}
