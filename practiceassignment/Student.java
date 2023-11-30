package practiceassignment;

public class Student {
String name;
int id;

Student(String name,int id){
	this.name=name;
	this.id=id;
}
void setName() {
	System.out.println(name);
}
String getName() {
	return name;
}

void setId()
{
	System.out.println(id);
}

int getId() {
	return id;
}
}
