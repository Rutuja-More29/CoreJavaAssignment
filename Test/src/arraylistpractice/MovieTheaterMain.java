package arraylistpractice;

import java.util.ArrayList;

public class MovieTheaterMain {

	public static void main(String[] args) {
		ArrayList<Theater>al=new ArrayList<>();
		
		MovieTheaterOperation mto=new MovieTheaterOperation();
		mto.setArrayList(al);
		mto.display(al);
		mto.removeMovie(al);

	}

}
