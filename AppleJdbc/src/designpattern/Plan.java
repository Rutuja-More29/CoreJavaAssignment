package designpattern;

public abstract class Plan {
	double unitRate;
	abstract void getunitRate();
	void billCalculation(int units) {
		System.out.println("Total bill is:"+(units*unitRate));
	}
}
