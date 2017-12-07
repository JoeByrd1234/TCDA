package tekken;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TekkenCharacter {
	public String name;
	public ArrayList<Move> moves = new ArrayList<Move>();
	public TekkenCharacter(String name){
		this.name = name;
		File file = new File("Tekken Character Data/" +name+".txt");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()){
				String line = scan.nextLine();
				//System.out.println(line);
				moves.add(new Move(line));
			}
		} catch (FileNotFoundException e) {
			System.out.println(name + " file not found");
		}
	}
	
	public void printMoves(){
		for (int i = 0; i < moves.size(); i++){
			moves.get(i).printMove();
		}
	}
	
	public void findStartupFrames(int a,int b){
		for (int i = 0; i < moves.size(); i++){
			if (moves.get(i).startUp <= b && moves.get(i).startUp >= a){
				moves.get(i).printMove();
			}
		}
	}
}
