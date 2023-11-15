package polymorphism;

public class MathOperation {
int add(int a,int b)
{
	
	return a+b;
}
double add(double a,double b)
{
	return a+b;
}

int sub(int a,int b)
{
	return a-b;
}

double sub(double a,double b)
{
	return a-b;
}

int mul(int a,int b)
{
	return a*b;
}

double mul(double a,double b)
{
	return a*b;
}

int div(int a, int b)
{
	return a/b;
}
double div(double a,double b)
{
	return a/b;
}

int mod(int a,int b)
{
	return a%b;
}
double mod(double a,double b) {
	return a%b;
}
public static void main(String [] args)
{
	MathOperation p = new MathOperation();
	
	int result = p.add(6, 9);
	System.out.println(result);
	double result1 = p.add(5.6, 6.9);
	System.out.println(result1);
	double result3 = p.mod(69, 96);
	System.out.println(result3);
}
}
