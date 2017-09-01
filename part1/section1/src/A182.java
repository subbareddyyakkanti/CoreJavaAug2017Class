class A182A 
{
	A182A()
	{
		System.out.println("A182A()");
	}
	{
		System.out.println("A182A-IIB1");
	}
	{
		System.out.println("A182A-IIB2");
	}
}
class A182B extends A182A
{
	{
		System.out.println("A182B-IIB1");
	}
	A182B()
	{
		System.out.println("A182B()");
	}
	{
		System.out.println("A182B-IIB2");
	}
}
class A182
{
   
	public static void main(String[] args) 
	{
		A182A a=new A182A();
		System.out.println("-----");
		A182B b=new A182B();
	}
}
