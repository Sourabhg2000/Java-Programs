package Abstract;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c=new Car();
        c.setCompany("Range Rover");
       c.setModel("Defernde");
        c.setYear(2013);
        
        System.out.println("The Car is of "+c.getcompany()+ " and the model is "+c.getModel()+ " manufacture in "+ c.getYear());
        MotorCycle mc=new MotorCycle();
        mc.setCompany("Yamaha");
        mc.setModel("R1");
        mc.setYear(2012);
        System.out.println("The MoorCycle is of "+mc.getcompany()+ " and the model is "+mc.getModel()+ " manufacture in "+ mc.getYear());
	}

}
