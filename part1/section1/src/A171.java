class A171A
{
	int x;
}
class A171B extends A171A
{
	int y;
}
class A171C extends A171B
{
	int z;
}
class A171
{
	public static void main(String[] args) 
	{
		A171A a=new A171A();
		A171B b=new A171B();
		A171C c=new A171C();
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
	}
}
