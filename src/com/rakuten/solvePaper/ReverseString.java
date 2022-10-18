package com.rakuten.solvePaper;

public class ReverseString {
public static void main(String[] args) {
   String s = "The quick brown fox";
   String reverse = "";
   
   for(int i = s.length()-1; i>=0; i--){
	   reverse = reverse+ s.charAt(i);
   }
   System.out.println(reverse);
}
}
