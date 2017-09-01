class A158 
{
	A158()
	{
		System.out.println("A158()");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		A158 a=new A158();
		System.out.println("----");
		A158 b=new A158();
		System.out.println("-----");
	}
}
