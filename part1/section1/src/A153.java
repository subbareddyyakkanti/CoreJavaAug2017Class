class A153 
{
	A153()
	{
		System.out.println("A153()");
	}
	A153(int i)
	{
		this();
		System.out.println("A153(int)");
	}
	A153(char c)
	{
		this();
		System.out.println("A153(char)");
	}
	A153(boolean b)
	{
		this('a');
		System.out.println("A153(boolean)");
	}
	A153(double d)
	{
		this(10);
		System.out.println("A153(double)");
	}
	public static void main(String[] args) 
	{
		A153 a=new A153();
		System.out.println("-----");
		A153 b=new A153('a');
		System.out.println("------");
		A153 c=new A153(10);
		System.out.println("-----");
		A153 d=new A153(10.9);
		System.out.println("----");
		A153 e=new A153(false);
		System.out.println("-----");
	}
}
