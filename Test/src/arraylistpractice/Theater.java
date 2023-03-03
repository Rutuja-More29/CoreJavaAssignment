package arraylistpractice;

import java.util.ArrayList;

public class Theater {
	int tid;
	String tname;
	ArrayList<Movie> movie;

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTid() {
		return tid;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTname() {
		return tname;
	}

	public void setMovie(ArrayList<Movie> movie) {
		this.movie = movie;
	}

	public ArrayList<Movie> getMovie() {
		return movie;
	}

	public String toString() {
		return tid + " " + tname + " " + movie;
	}
}
