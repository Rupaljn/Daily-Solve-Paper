package com.rakuten.solvePaper;

public class CountLatterSpaceNumberofString {
public static void main(String[] args){
	String text = "The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	count(text); 
	}
public static void count(String x){
	char ch [] = x.toCharArray();
	
	int latter = 0;
	int space = 0;
	int num = 0;
	int other = 0;
	
	for(int i = 0; i<x.length(); i++){
		
		if(Character.isLetter(ch[i])){
			latter ++;
		}
		else if(Character.isDigit(ch[i])){
			num ++;
		}
		else if(Character.isSpaceChar(ch[i])){
			space ++;
		}
		else{
			other ++;
		}
		
	}
	System.out.println("The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33"
);
	System.out.println("latter" + latter);
	System.out.println("Space" + space);
	System.out.println("Number" + num);
	System.out.println("Other " + other);
	
}

}
