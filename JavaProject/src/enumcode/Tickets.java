package enumcode;

public enum Tickets {
	SILVER(150)
	{
		public String toString()
		{
			return "Silver rate is 150/-";
		}
	},
	GOLD(200)
	{
		public String toString()
		{
			return "Gold rate is 200/-";
		}
	},
	PlATINUM(250)
	{
		public String toString()
		{
			return "Platinum rate is 250/-";
		}
	};
	int rate;
	private Tickets(int rate)
	{
		this.rate=rate;
	}
}
