class A179A 
{
	A179A(int i)
	{
		System.out.println("A179A(int)");
	}
}
class A179B extends A179A
{
    A179B()
	{
		super(10);
		System.out.println("A179B()");
	}
}
class A179
{
  
	public static void main(String[] args) 
	{
		A179A a=new A179A(40);
		System.out.println("----");
		A179B b=new A179B();
	}
}
