package me.patrick.mcdonald.adventofcode;

import java.util.LinkedList;
import java.util.List;

public class AdventOfCode {
	
	private List<Runnable> _executionScripts = new LinkedList<Runnable>();
	
	private long _startTime;
	private long _endTime;
	
	public void startCounter(){
		_startTime = System.currentTimeMillis();
	}
	
	public void endCounter(boolean displayResult){
	     _endTime = System.currentTimeMillis();
	    
	     if(displayResult)
	    	display();
	 }
	
	public void endCounter(){
		endCounter(false);
	}
	
	public void display(){
		System.out.println("Total execution time: " + (_endTime-_startTime) + "ms"); 
	}
}
