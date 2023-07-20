package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class main_misc {
	
	
	public static final int MAX = 1_000_000;
	
	public static void main(String[] args) {
		
	List<Integer> deck = new ArrayList<>();
	for(int i = 1;i <= 52;i++) {
		deck.add(i);
	}
	System.out.println(deck);
	shuffle(deck);
	System.out.println(deck);
	
	}
	
	private static void shuffle(List<Integer> deck){
		//The deck will be represented as a integer array from 1 to 52
		
		List<Integer> arr = new ArrayList<>();
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		int c = 0;
		
		while(c < 52){
			
			int i = 0;
			while(true && i <= MAX){
				
				Random r = new Random();
				int x = 1 + r.nextInt(52);//[1,52]
				if(!map.containsKey(x)){
					map.put(x,true);
					arr.add(x);
					c++;
					break;
				}
				
				i++;
			}
			
			
		}
		deck.clear();
		deck.addAll(arr);
		
	}
	
	
	
	

}
