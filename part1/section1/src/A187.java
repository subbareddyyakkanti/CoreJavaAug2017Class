class A187 
{
	static
	{
		System.out.println("A187-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("A187-main");
	}
}
class A187M1 extends A187
{
	static
	{
		System.out.println("A187M1-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A187M1-main");
	}
}
class A187M2 extends A187M1
{
	static
	{
		System.out.println("A187M2-SIB");
	}
}
class A187M3
{
	static
	{
		System.out.println("A187M3-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A187M3-main-begin");
		A187M1.main(arg);
		System.out.println("A187M3-main-end");
	}
}
class A187M4
{
	static
	{
		System.out.println("A187M4-SIB");
	}
	public static void main(String arg[])
	{
		System.out.println("A187M4-main-begin");
		A187M2.main(arg);
		A187M1.main(arg);
		System.out.println("A187M4-main-end");
	}
}
