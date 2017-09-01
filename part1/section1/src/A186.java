class A186 
{
	static
	{
		System.out.println("A186-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("A186-main");
	}
}

class A186M1 extends A186
{
	static
	{
		System.out.println("A186M1-SIB");
	}
}
class A186M2
{
	static
	{
		System.out.println("A186M2-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A186M2-main-begin");
		A186.main(arg);
		System.out.println("A186M2-main-end");
	}
}

class A186M3
{
	static
	{
		System.out.println("A186M3-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A186M3-main-begin");
		A186M1.main(arg);
		System.out.println("----");
		A186.main(arg);
		System.out.println("A186M3-main-end");
	}
}