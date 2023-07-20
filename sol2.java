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
	shuffle(deck,deck.size());
	System.out.println(deck);
	
	}
	
	private static void swap(List<Integer> deck,int i,int j){
		
		int tmp = deck.get(i);
		
		deck.set(i, deck.get(j));
		deck.set(j, tmp);
		
	}
	
	private static void base_case(List<Integer> deck) {
		
		//base case happens when the deck has only 2 cards
		
		//equal probs on 1,2 and 2,1
		for(int i = 0;i < 2;i++) {
			Random r = new Random();
			int x = r.nextInt(2);
			swap(deck,i,x);
		}
		
		
	}
	
	private static void shuffle(List<Integer> deck,int n) {
		
		if(n == 2) {
			base_case(deck);
			return;
		}
		
		
		Random r = new Random();
		swap(deck,n-1,r.nextInt(n-2));
		shuffle(deck,n-1);
		
	}
	
	
	

}
