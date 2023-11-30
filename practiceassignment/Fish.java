package practiceassignment;

public class Fish {
	  protected String species;

	    public Fish(String species) {
	        this.species = species;
	    }

	    public void greeting() {
	        System.out.println("I'm just a regular fish." + species);
	    }
}
