package Day1;

public class Player {
private String name,position;
private int age;

public Player(String name,String position,int age)
{
	this.name=name;
	this.position=position;
	this.age=age;
}

public void info() {
	System.out.println("Player Name: "+ name);
	System.out.println("Player age: "+ age);
	System.out.println("Player Position: "+ position);
}
}
