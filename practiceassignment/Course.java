package practiceassignment;
import java.util.*;
public class Course {
String c_name;
int c_code;

List<Student> enroll;

Course(String c_name,int c_code){
	this.c_code=c_code;
	this.c_name=c_name;
	
	this.enroll=new ArrayList<>();
}
}
