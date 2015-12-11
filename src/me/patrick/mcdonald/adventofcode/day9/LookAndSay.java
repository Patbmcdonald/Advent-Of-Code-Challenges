package me.patrick.mcdonald.adventofcode.day9;

import me.patrick.mcdonald.adventofcode.AdventOfCode;

public class LookAndSay extends AdventOfCode {

	private final int[] NUMBER_OF_ITERATIONS = new int[]{ 40, 20 };
	
	public LookAndSay(){
		init();
	}
	public static void main(String[] args){
		new LookAndSay();
	}
	
	public void init(){
		System.out.println("Look and Say");
		startCounter();
		runIteration("1", NUMBER_OF_ITERATIONS[0]);
		runIteration("1", NUMBER_OF_ITERATIONS[1]);
		endCounter();
		display();
	}
	public void runIteration(String number, int iterations){
		for(int i = 0; i < iterations; i++){
			number=lookAndSay(number);
			System.out.println("Iteration: " + i + " \n " + number);
			
		}
	}
	
	public String lookAndSay(String number){
		StringBuffer result= new StringBuffer(number.length() * 2);
		
		char repeatedNumber = number.charAt(0);
		String currentSequence = number.substring(1) + " ";
		int repeatedTimes= 1;
	 
		for(char currentNumber: currentSequence.toCharArray()){
			if(currentNumber != repeatedNumber){
				result.append(repeatedTimes + "" + repeatedNumber);
				repeatedTimes= 1;
				repeatedNumber= currentNumber;
			}else{
				repeatedTimes+= 1;
			}
		}
		return result.toString();
	}
}
