package aggregate1;

public class Salary {
double sal;
Employee info;


Salary()
{
	sal = 678399;
	info = new Employee();
}
Salary(double sal,String name,String position)
{
	this.sal =sal;

	this.info = info;
	info = new Employee("Sourabh" , "Director");
}



}
