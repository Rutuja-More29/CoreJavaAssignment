package arraylistcodes;

import java.util.ArrayList;
import java.util.List;

import collections.Movie;

public class Theater {
	int id;
	String name;
	ArrayList<MovieT> m;
	public int getId() {
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
	public ArrayList<MovieT> getM() {
		return m;
	}
	public void setM(ArrayList<MovieT>m) {
		this.m =m ;
	}
	public String toString()
	{
		return id+" "+name+" "+m;
	}
}
