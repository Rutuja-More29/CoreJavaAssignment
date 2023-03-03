package com.test;

public class QueueExample {
	 int[] arr;
	 int front;
	 int rear;
	 int size;

	public QueueExample(int capacity) {
		arr = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void enqueue(int item) {
		if (isFull()) {
			throw new RuntimeException("Queue is full");
		}
		rear = (rear + 1) % arr.length;
		arr[rear] = item;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int item = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return item;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return arr[front];
	}

}
