class A151 
{
	A151()
	{
		this(10);
		System.out.println("A151()");
	}
	A151(int i)
	{
		System.out.println("A151(int)");
	}
	public static void main(String[] args) 
	{
		A151 a=new A151();
		System.out.println("----");
		A151 b=new A151(30);
		System.out.println("----");
	}
}
