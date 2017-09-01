class A177A 
{
    A177A(int i)
	{
		System.out.println("A177A(int)");
	}
	A177A()
	{
		System.out.println("A177A()");
	}
}
class A177B extends A177A
{
	A177B(int i)
	{
		System.out.println("A177B(int)");
	}
}
class A177
{
    
	public static void main(String[] args) 
	{
		A177A a=new A177A(90);
		System.out.println("-----");
		A177B b=new A177B(80);
	}
}
