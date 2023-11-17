package Abstract;

public class This {

	    private String name;

	    public This(String name) {
	        this.name = name; // Use 'this' to distinguish between the local and instance variable
	    }

	    public void displayInfo(String name) {
	        System.out.println("Instance variable name: " + this.name);
	        System.out.println("Method parameter name: " + name);
	    }
	}

	


