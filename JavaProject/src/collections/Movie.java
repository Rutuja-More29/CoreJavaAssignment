package collections;

import java.util.ArrayList;

public class Movie {
	int id;
	String name ,boxoffcollection;
	ArrayList<Actor>act;

	
	
	Movie(int id,String name,String boxffcollection,ArrayList<Actor>act)
	{
		this.id=id;
		this.name=name;
		this.boxoffcollection=boxoffcollection;
		this.act=act;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Actor> getAct() {
		return act;
	}
	public void setAc(ArrayList<Actor> act) {
		this.act = act;
	}
	public String getBoxoffcollection() {
		return boxoffcollection;
	}
	public void setBoxoffcollection(String boxoffcollection) {
		this.boxoffcollection = boxoffcollection;
	}*/
	public String toString()
	{
		return id+" "+name+" "+act+" "+boxoffcollection;
	}

}
