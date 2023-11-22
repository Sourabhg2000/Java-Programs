package Final;

public final class Variable {
final String name = "Tiger";

public final void mul()
{
	System.out.println(12*12);
}

public static void main(String [] args)
{
	Variable a = new Variable();
	System.out.println(a.name);
	a.mul();
}
}
