package map;
import java.util.HashMap;
public class FBUserMain {
	void setElement(HashMap<FBUser,Integer>hm)
	{
		hm.put(new FBUser(111,"rita","rita@gmail.com","female",98345,986745321), 22);
		hm.put(new FBUser(10,"siya","siya@gmail.com","female",98001,99676621), 24);
		hm.put(new FBUser(51,"nita","nita@gmail.com","female",55345,896745321), 20);
		hm.put(new FBUser(67,"jay","jay@gmail.com","male",88645,876745321), 12);
		hm.put(new FBUser(33,"shree","shree@gmail.com","male",99945,78674555), 29);
		hm.put(new FBUser(45,"naman","naman@gmail.com","male",96645,86745320), 22);
	}
	
	

	public static void main(String[] args) {
		HashMap<FBUser,Integer> fh=new HashMap<>();
		FBUserMain fb=new FBUserMain();
		fb.setElement(fh);
		System.out.println(fh);
		fh.put(new FBUser(111,"shreeja","shreeja@gmail.com","female",8765,98453216), 22);
		System.out.println(fh);
		
	}

}
