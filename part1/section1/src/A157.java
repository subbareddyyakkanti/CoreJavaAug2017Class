class A157 
{
	A157()
	{
		System.out.println("A157()");
	}
	{
		System.out.println("IIB");
	}
	A157(int i)
	{
		System.out.println("A157(int)");
	}
	public static void main(String[] args) 
	{
		A157 a=new A157();
		System.out.println("----");
		A157 b=new A157(20);
		System.out.println("----");
	}
}
