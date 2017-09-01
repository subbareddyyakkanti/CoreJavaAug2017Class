class A173A extends Object 
{
	A173A()
	{
		super();
		System.out.println("A173A()");
	}
}
class A173B extends A173A
{
	A173B()
	{
		super();
		System.out.println("A173B()");
	}
}
class A173C extends A173B
{
	A173C()
	{
		super();
		System.out.println("A173C()");
	}
}
class A173
{

	public static void main(String[] args) 
	{
		A173A a=new A173A();
		System.out.println("----");
		A173B b=new A173B();
		System.out.println("----");
		A173C c=new A173C();
		System.out.println("----");
	}
}
