class A148 
{
	A148(int i, int j)
	{
		System.out.println("int,int");
	}
	A148(double d,int i)
	{
		System.out.println("double,int");
	}
	public static void main(String[] args) 
	{
		A148 a=new A148(10,20);
		System.out.println("----");
		A148 b=new A148(10.9,20);
		System.out.println("-----");
	}
}
