package abstractionassignment;

public class Juice extends Machine {
	

		@Override
		void crush() {
			System.out.println("crushing");
			
		}
		void filter()
		{
			System.out.println("filtering");
		}

		public static void main(String args[])
		{
			Juice juicer=new Juice();
			
			juicer.rotate();
			juicer.crush();
			juicer.filter();
			
			Machine m=new Juice();
			m.rotate();
			m.crush();
			
		}
	}

	

