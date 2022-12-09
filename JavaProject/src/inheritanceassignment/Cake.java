package inheritanceassignment;

public interface Cake {
	void bake();
}
class Strawberry implements Cake{
	public void bake()
	{
		System.out.println("baking strawberry cake ");
	}
}
 class BlackForest implements Cake{
	 public void bake()
	 {
		 System.out.println("baking blackforest cake");
	 }
 }
 