package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieMain {
	void setData(ArrayList<Movie>am)
	{
		ArrayList<Actor> act1=new ArrayList<>();
		ArrayList<Actor>act2=new ArrayList<>();
		ArrayList<Actor>act3=new ArrayList<>();
		
		act1.add(new Actor(1,"Amitabh"));
		act1.add(new Actor(2,"abhishek"));
		act1.add(new Actor(3,"aishwarya"));
		
		act2.add(new Actor(5,"Akshay kumar"));
		act2.add(new Actor(6,"govinda"));
		
		act3.add(new Actor(1,"Amitabh"));
		act3.add(new Actor(4,"abcd"));
		
		am.add(new Movie(10,"guru","10cr",act1));
		am.add(new Movie(14,"bhagambag","15cr",act2));
		am.add(new Movie(18,"abab","5cr",act3));
		
		
	}
	void removeElement(ArrayList<Movie>m)
	{
		Iterator<Movie> itr=m.iterator();
		while(itr.hasNext())
		{
			Movie me=itr.next();
			for(Actor a:me.act)
			{
				if(a.name.equalsIgnoreCase("Amitabh"));
				{
					itr.remove();
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Movie> am=new ArrayList<>();
		MovieMain m2=new MovieMain();
		m2.setData(am);
		System.out.println(m2);
		m2.removeElement(am);
		System.out.println(am);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Movie id,name,boxoffcollection:");
			int id=sc.nextInt();
			String name=sc.next();
			String boxoffcollection=sc.next();
			
			Movie m1=new Movie();
			
			ArrayList<Actor>ac=new ArrayList<>();
			
			
		}*/

	}

}
