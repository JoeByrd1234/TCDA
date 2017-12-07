package tekken;

import java.util.Scanner;

public class Move {
	public String input,damage,hitLevel;
	public int startUp,advOnHit,advOnBlock,advOnCH;
	
	public Move(String line){
		Scanner scan = new Scanner(line);
		scan.useDelimiter("\t");
		input = scan.next();
		hitLevel = scan.next();
		damage = scan.next();
		startUp = parseValue(scan.next());
		advOnBlock = parseValue(scan.next());
		advOnHit = parseValue(scan.next());
		advOnCH = parseValue(scan.next());
		
//		System.out.println(input);
//		System.out.println(hitLevel);
//		System.out.println(damage);
//		System.out.println(startUp);
//		System.out.println(advOnBlock);
//		System.out.println(advOnHit);
//		System.out.println(advOnCH);
		
	}
	
	public void printMove(){
		System.out.println(input + " " + hitLevel + " " + damage + " " + startUp + " " + advOnBlock + " "
				+ advOnHit + " " + advOnCH);
	}
	
	public int parseValue(String line){
		//System.out.println(line);
		if (line.equals("KND ") || line.equals("KND(KND) ") || line.equals("Launch ") || line.equals("Launch (JG?) "))
			return 999;
		else if (line.equals("CS "))
			return 998;
		else if (line.equals("KMUD "))
			return 997;
		else if (line.equals("Throw (0orD) "))
			return 996;
		else
			return extractFirstNumber(line);
	}
	
	public int extractFirstNumber(String startUpString){
		String temp = "";
		temp += startUpString.charAt(0);
		for (int i = 1; i < startUpString.length(); i++){
			char a = startUpString.charAt(i);
			if (Character.isDigit(a)){
				temp += a;
			}
			else{
				break;
			}
		}
		
		return Integer.parseInt(temp);
	}
	
}
