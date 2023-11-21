package Aggragation;

public class Address {
String area,city,state,country;
long pincode; 

public Address(String area,String city,String state,String country,long pincode) {
	this.area=area;
	this.city=city;
	this.state=state;
	this.country=country;
	this.pincode=pincode;
}

public Address() {
	area = "Bhekrai Nagar";
	city="Pune";
	state="Maharashtra";
	country="Bharat";
	pincode =412308;
}

void show() {
	System.out.println(area + " " + city + " " + state + " " + country+ " "+ pincode);
}

void bc(){
	System.out.println(10*14);
}
}
