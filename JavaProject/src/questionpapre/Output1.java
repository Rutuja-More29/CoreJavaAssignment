package questionpapre;

public class Output1 {
public static void main(String []args) {
	Car wagonR=new Car();
	wagonR.modelno=3245;
	wagonR.name="WagonR";
	wagonR.price=50000;
	wagonR.company="maruti";
	Car baleno=new Car(3408,"baleno","suzuki");
	if(baleno.price>wagonR.price)
		System.out.println(baleno);
	else
		System.out.println(wagonR);
	
}
}
