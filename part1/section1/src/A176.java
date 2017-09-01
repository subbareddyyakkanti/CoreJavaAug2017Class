class A176A 
{
	A176A()
	{
		System.out.println("A176A()");
	}
	A176A(int i)
	{
		System.out.println("A176A(int)");
	}
}
class A176B extends A176A
{
	A176B()
	{
		System.out.println("A176B()");
	}
	A176B(int i)
	{
		System.out.println("A176B(int)");
	}
}
class A176
{
	public static void main(String[] args) 
	{
		A176A a1=new A176A();
		System.out.println("-----");
		A176A a2=new A176A(20);
		System.out.println("-----");
		A176B b1=new A176B();
		System.out.println("----");
		A176B b2=new A176B(30);
		System.out.println("----");
	}
}
