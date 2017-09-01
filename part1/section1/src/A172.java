class A172A 
{
	A172A()
	{
		System.out.println("A172A()");
	}
}
class A172B extends A172A
{
	A172B()
	{
		System.out.println("A172B()");
	}
}
class A172
{

	public static void main(String[] args) 
	{
		A172A a=new A172A();
		System.out.println("-----");
		A172B b=new A172B();
		System.out.println("-----");
	}
}
