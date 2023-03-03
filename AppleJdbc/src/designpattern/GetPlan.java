package designpattern;

public class GetPlan {
	Plan getUserPlan(String name) {
		if(name==null) {
			return null;
		}
		else if(name.equalsIgnoreCase("Home")){
			return new HomePlan();
		}
		else if(name.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		}
		else if(name.equalsIgnoreCase("Industrial")) {
			return new IndustrialPlan();
		}
		else
			return null;
	}
}
