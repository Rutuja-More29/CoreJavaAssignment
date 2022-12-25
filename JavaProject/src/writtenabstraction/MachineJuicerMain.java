package writtenabstraction;

public class MachineJuicerMain {

	public static void main(String[] args) {
		// create object juicer and call crush rotate filter method
		Juicer j=new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		// create object of type juicer with reference variable machine
		System.out.println("Using reference variable machine....!!!");
		Machine m=new Juicer();
		m.crush();
		m.rotate();
		

	}

}
