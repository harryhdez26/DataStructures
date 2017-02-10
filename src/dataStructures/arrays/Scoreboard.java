package dataStructures.arrays;

public class Scoreboard {
	
	private GameEntry[] scoreboard;
	private int size;
	
	public Scoreboard(int numberOfHighScores){
		scoreboard = new GameEntry[numberOfHighScores];
		size = 0;
	}
	
	public int addEntry(String name, int score){
		
		GameEntry entry = new GameEntry(name, score);
		
		if(size != scoreboard.length || (size == scoreboard.length && entry.getScore() > scoreboard[size - 1].getScore())){
			if(size != scoreboard.length)
				size++;
			
			int i = size - 1;
			while(i > 0 && scoreboard[i - 1].getScore() < entry.getScore()){
				scoreboard[i] = scoreboard[i - 1];
				i--;
			}
			scoreboard[i] = entry;
			return i;
		} 
		return -1;
	}
	
	public String toString(){
		String scores = "";
		
		for (int i = 0; i < size; i++) {
			scores += scoreboard[i].toString();
		}
		
		return scores;
	}
	
	private static class GameEntry {
		 private String name;
		 private int score;
		 
		 public GameEntry(String name, int score){
			 this.name = name;
			 this.score = score;
		 }
		 
		 public String getName(){
			 return name;
		 }
		 
		 public int getScore(){
			 return score;
		 }
		 
		 public String toString(){
			 return "Name: " + name + ", Score: " + score + "\n";
		 }
	}

}
