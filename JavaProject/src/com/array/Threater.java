package com.array;

import java.util.Arrays;

public class Threater {
	int tid;
	String tname;
	Movie m[];

	Threater(int tid, String tname, Movie m[]) {
		this.tid = tid;
		this.tname = tname;
		this.m = m;
	}

	public String toString() {
		return tid + " " + tname + " " + Arrays.toString(m);
	}
}
