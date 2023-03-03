package com.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	void play(int player1,int player2) {
		if(player1==0) {
			System.out.println("player1 choose=rock");
		}
		else if(player1==1) {
			System.out.println("player 1 choose=paper");
		}
		else if(player1==2) {
			System.out.println("player1 choose=scissors");
		}
		else {
			System.out.println("choose value between 0 to 2");
		}
		
		if(player2==0) {
			System.out.println("player2 choose=rock");
		}
		else if(player2==1) {
			System.out.println("player2 choose=paper");
		}
		else if(player2==2) {
			System.out.println("player2 choose=scissors");
		}
		else {
			System.out.println("choose value between 0 to 2");
		}
		switch(player1) {
		case 1:
			if(player2==1) {
				System.out.println("player2 win");
			}
			else
			{
				System.out.println("player1 win");
			}
			break;
		case 2:
			if(player2==0) {
				System.out.println("player2 win");
			}
			else
			{
				System.out.println("player1 win");
			}
			break;
		case 3:
			if(player2==2) {
				System.out.println("player2 win");
			}
			else
			{
				System.out.println("player1 win");
			}
			break;
			default:
				System.out.println("try next time");
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rock=0,paper=1,scissors=2;
		// create random input to computer
		Random rnd=new Random();
		System.out.println("rock  paper scissors  game");
		System.out.println("Enter your choice (0=rock,1=paper,2=scissors");
		int player1=sc.nextInt();
		int player2=sc.nextInt();
		
		RockPaperScissors p=new RockPaperScissors();
		p.play(player1, player2);
		

	}

}
