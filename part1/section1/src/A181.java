class A181A 
{
	A181A()
	{
		System.out.println("A181A()");
	}

	{
		System.out.println("A181A-IIB");
	}
}
class A181B extends A181A
{
   A181B()
	{
	   System.out.println("A181B()");
	}

	{
		System.out.println("A181B-IIB");
	}
}
class A181
{

	public static void main(String[] args) 
	{
		A181A a=new A181A();
		System.out.println("-----");
		A181B b=new A181B();
		System.out.println("-----");
	}
}
