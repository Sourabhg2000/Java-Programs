package Inheritance;
import java.util.*;
public class School {
	
	    String name;
	    ArrayList<String> studentNames;

	    public School(String name) {
	        this.name = name;
	        this.studentNames = new ArrayList<>();
	    }

	    public void addStudent(String studentName) {
	        studentNames.add(studentName);
	    }

	    public void removeStudent(String studentName) {
	        studentNames.remove(studentName);
	    }

	    public void displayStudents() {
	        System.out.println("Students in " + name + ": " + studentNames);
	    }
	}

