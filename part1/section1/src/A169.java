class A169A 
{
	int i;
	void test()
	{
		System.out.println("test");
	}
}
class A169B extends A169A
{
    int j;
}
class A169
{

	public static void main(String[] args) 
	{
		A169B b=new A169B();
		b.i=10;
		b.j=20;
		b.test();
		System.out.println(b.i);
		System.out.println(b.j);
	}
}
