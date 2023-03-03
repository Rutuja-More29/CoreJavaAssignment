package augusttest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberSocietyMain {
	void createArrayList(ArrayList<MemberSociety>al) {
		MemberSociety m1=new MemberSociety();
		MemberSociety m2=new MemberSociety();
		MemberSociety m3=new MemberSociety();
		
		m1.setMemberid(111);
		m1.setWing_flatNo("A-501");
		m1.setName("riya");
		al.add(m1);
		
		m2.setMemberid(123);
		m2.setWing_flatNo("B-502");
		m2.setName("suresh");
		al.add(m2);
		
		m3.setMemberid(144);
		m3.setWing_flatNo("A-503");
		m3.setName("shreya");
		al.add(m3);
		
		 Map<String, List<String>> wingFlatNamesMap = new HashMap<>();

	        for (MemberSociety member : al) {
	            String wingFlatNo = member.getWing_flatNo();
	            String name = member.getName();

	            List<String> namesList = wingFlatNamesMap.getOrDefault(wingFlatNo, new ArrayList<>());
	            namesList.add(name);
	            wingFlatNamesMap.put(wingFlatNo, namesList);
	        }

	        for (String wingFlatNo : wingFlatNamesMap.keySet()) {
	            System.out.println("Wing_FlatNo: " + wingFlatNo + ", Names: " + wingFlatNamesMap.get(wingFlatNo));
	        }
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberSociety>al=new ArrayList<>();
		HashMap<Integer,ArrayList<String>>hm=new HashMap<>();
		
		MemberSocietyMain m=new MemberSocietyMain();
		m.createArrayList(al);
		
		

	}

}
