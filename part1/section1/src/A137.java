class A137 
{
	int x;
	static void test(A137 obj)
	{
		obj.x=10;
	}
	public static void main(String[] args) 
	{
		A137 a=new A137();
		a.x=5;
		System.out.println(a.x);
		test(a);
		System.out.println(a.x);
		a=null;
		System.out.println("abandoned");
		a.x=20;
		System.out.println(a.x);
	}
}
