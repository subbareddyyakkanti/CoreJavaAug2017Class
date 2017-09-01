class A149 
{
	A149()
	{
		System.out.println("A149()");
	}
	A149(int i)
	{
		System.out.println("A149(int)");
	}
	A149(int i,int j)
	{
		System.out.println("A149(int , int)");
	}

	public static void main(String[] args) 
	{
		A149 a=new A149();
        System.out.println("----");
		A149 b=new A149(20);
		System.out.println("-------");
		A149 c=new A149(40,30);
		System.out.println("-----");
	}
}
