package mappractice;

import java.util.HashMap;

public class EmployeeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,Integer>hm=new HashMap<>();
		hm.put("rita", 45000);
		hm.put("sita", 5000);
		hm.put("prita", 45000);
		hm.put("nita", 45000);
		
		HashMap<Integer,Integer> hm1=new HashMap<>();
		for(int salary:hm.values()) {
			if(hm1.containsKey(salary)) {
				hm1.put(salary, hm1.get(salary)+1);
			}else
			{
				hm1.put(salary, 1);
			}
		}
		for(int salary:hm1.keySet()) {
			System.out.println(salary+" "+hm1.get(salary));
		}

	}

}
