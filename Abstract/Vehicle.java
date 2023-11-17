package Abstract;

public abstract class Vehicle {
protected String company,model;
protected int year;
public abstract void start();
public abstract void stop();



void setCompany(String company) {
	this.company=company;
}
void setModel(String model) {
	this.model=model;
}
void setYear(int year) {
	this.year=year;
}
String getModel() {
	return model;
}
String getcompany() {
	return company;
}
int getYear() {
	return year;
}

}
