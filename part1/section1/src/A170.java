class A170A 
{
	int i;
	static int j;
	void test1()
	{
		System.out.println("test1");
	}
	static void test2()
	{
		System.out.println("test2");
	}
}
class A170 extends A170A
{
    int k;
	static void test3()
	{
		System.out.println("test3");
	}
	public static void main(String[] args) 
	{
		A170A.j=10;
		A170A.test2();
		A170.test2();
		A170.test3();
		System.out.println(A170.j);
		A170A a=new A170A();
		a.i=20;
		a.test1();
		A170 b=new A170();
		b.i=30;
		b.k=50;
		b.test1();
		
	}
}
