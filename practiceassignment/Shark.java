package practiceassignment;

public class Shark extends Fish{
double weight;
double length;
int teeth;

public Shark(double weight,double length,int teeth,String species) {
	super(species);
	this.weight=weight;
	this.length=length;
	this.teeth=teeth;
}
public void display() {
	System.out.println("I am "+species+" i have weight and length "+ weight+" " +length+ " respectively." + "I also have more than "+teeth+ " teeth");
}
public void greeting() {
	System.out.println("I am overlord of this sea");
}

public void bite() {
	System.out.println("I can Bite You!!");
}
}
