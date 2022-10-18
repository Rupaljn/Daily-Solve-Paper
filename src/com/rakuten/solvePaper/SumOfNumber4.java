package com.rakuten.solvePaper;

public class SumOfNumber4 {
public static void main(String[] args) {
	int num = 25;
	int sum = 0;
	
	while(num!=0){
		sum+= num%10;
		num/= 10;
	}
	System.out.println(sum);
}
}
