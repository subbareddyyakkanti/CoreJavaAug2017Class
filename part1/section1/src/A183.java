class A183A 
{
	{
		System.out.println("A183A-IIB");
	}
	A183A()
	{
		System.out.println("A183A()");
	}
}
class A183B extends A183A
{
    A183B()
	{
		System.out.println("A183B()");
	}
	{
		System.out.println("A183B-IIB");
	}
	A183B(int i)
	{
		this();
		System.out.println("A183B(int)");
	}
}
class A183
{

	public static void main(String[] args) 
	{
		A183A a=new A183A();
		System.out.println("-------");
		A183B b=new A183B();
		System.out.println("-------");
		A183B c=new A183B(20);
		System.out.println("-----");
	}
}
