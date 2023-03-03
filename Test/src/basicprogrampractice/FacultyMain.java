package basicprogrampractice;

public class FacultyMain {

	public static void main(String[] args) {
		Faculty f=new Faculty();
		f.setId(11);
		f.setName("raj");
		f.setSubject("java");
		f.setContact(987543228);
		
		System.out.println(f.getId()+" "+f.getName()+" "+f.getSubject()+" "+f.getContact());

	}

}
