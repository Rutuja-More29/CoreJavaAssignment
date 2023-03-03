package queuepractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingConstructor {

	public static void main(String[] args) {
		// create queue using default constructor
		Queue<String>q=new LinkedList<>();
		// create queue initial capacity 10 parameterized constructor
		Queue<Integer>q2=new ArrayDeque<>(10);
		
		ArrayList<String>al=new ArrayList<>();
		al.add("pink");
		al.add("black");
		al.add("grey");
		al.add("green");
		
		Queue<String>q3=new LinkedList<>(al);
		
		System.out.println(q);
		System.out.println(q2);
		System.out.println(q3);

	}

}
