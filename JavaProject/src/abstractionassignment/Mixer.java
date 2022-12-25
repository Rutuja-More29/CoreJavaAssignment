package abstractionassignment;

public  class Mixer extends Machine {
	void blend()
	{
		System.out.println("Blending");
	}

	@Override
	void crush() {
		System.out.println("crushing");
		
	}
}
class MixerMachineMain{

public static void main(String args[]) {
	Mixer m1=new Mixer ();
	m1.crush();
	m1.blend();
}
}
