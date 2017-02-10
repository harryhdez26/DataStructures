package dataStructures.testing;

import dataStructures.arrays.Scoreboard;

public class ScoreboardTester {

	public static void main(String[] args) {
		
		Scoreboard board = new Scoreboard(5);
		
		System.out.println(board);
		
		board.addEntry("Harry", 500);
		board.addEntry("tfrv", 700);
		board.addEntry("g5", 600);
		board.addEntry("g7", 500);
		board.addEntry("g9", 750);
		board.addEntry("noo", 650);
		
		System.out.println(board);

	}

}
