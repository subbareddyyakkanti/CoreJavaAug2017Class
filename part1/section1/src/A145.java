class A145 
{
	A145(int i)
	{
		System.out.println("A145()");
	}

	public static void main(String[] args) 
	{
		A145 a=new A145(20);
		System.out.println("---");
		A145 b=new A145(10);
		System.out.println("---");
		A145 c=new A145();
		System.out.println("----");
	}
}
