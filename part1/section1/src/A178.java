class A178A 
{
	A178A()
	{
		System.out.println("A178A()");
	}
}
class A178B extends A178A
{
	A178B(int i)
	{
		System.out.println("A178B(int)");
	}
}
class A178
{
 
	public static void main(String[] args) 
	{
		A178A a=new A178A();
		System.out.println("-----");
		A178B b=new A178B(90);
	}
}
