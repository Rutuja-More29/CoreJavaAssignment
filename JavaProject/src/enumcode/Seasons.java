package enumcode;

public enum Seasons implements SeasonsDetails {
	RAINY
	{
		public void discription()
		{
			System.out.println("Rainy Seasons");
		}
	},
	WINTER
	{
	public void discription()
	{
		System.out.println("Winter Seasons");
	}
	},
	SUMMER
	{
		public void discription()
		{
			System.out.println("Summer Seasons");
		}
	};
	

}
