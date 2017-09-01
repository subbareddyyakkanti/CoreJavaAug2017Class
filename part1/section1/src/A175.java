class A175A 
{
	int square(int n)
	{
		return n*n;
	}
}
class A175
{
    A175A circle;
	double pi=3.14;
	double area(int radius)
	{
		circle=new A175A();
		int rsquare=circle.square(radius);
		return pi*rsquare;
	}
	public static void main(String[] args) 
	{
		A175 a=new A175();
		double result=a.area(5);
		System.out.println(result);
	}
}
