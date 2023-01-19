package map;
import java.util.ArrayList;
import java.util.HashMap;
public class Employee1AddressMain {
		void setArrayList(ArrayList<Employee1>emp1)
		{
			emp1.add(new Employee1(111,"riya","sale",56000,new Address("pune","maharashtra")));
			emp1.add(new Employee1(90,"siya","sale",56000,new Address("banglore","karnataka")));
			emp1.add(new Employee1(121,"kavya","dev",56000,new Address("pune","maharashtra")));
			emp1.add(new Employee1(119,"neha","sale",56000,new Address("mumbai","maharashtra")));
			emp1.add(new Employee1(611,"sneha","dev",56000,new Address("mumbai","maharashtra")));
			emp1.add(new Employee1(181,"swara","test",56000,new Address("pune","maharashtra")));
			emp1.add(new Employee1(19,"nena","sale",56000,new Address("mumbai","maharashtra")));
		}
		void createMap(ArrayList<Employee1>emp,HashMap<String,Integer>hm)
		{
			for(Employee1 e1:emp)
			{
				String s=e1.a.city;
				if(hm.containsKey(s))
				{
					int i=hm.get(s);
					hm.put(s, i+1);
				}
				else
				{
					hm.put(s, 1);
				}
			}
		}
	public static void main(String[] args) {
		ArrayList<Employee1> emp1=new ArrayList<>();
		
		HashMap<String ,Integer> hm=new HashMap<>();
		Employee1AddressMain am=new Employee1AddressMain();
		am.setArrayList(emp1);
		am.createMap(emp1, hm);
		System.out.println(hm);
		
	}

}
