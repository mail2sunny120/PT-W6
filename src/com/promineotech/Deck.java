/**
 * 
 */
package com.promineotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
    List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
    
	//constructor
	public Deck()
	{
		/* 
		List<Card> cards = new ArrayList<Card>(); */

/*		Card card2_Diamond = new Card(2, "2 Diamond");
		Card card3_Diamond = new Card(3, "3 Diamond");
		Card card4_Diamond = new Card(4, "4 Diamond");
		
		Card card5_Diamond = new Card(5, "5 Diamond");
		Card card6_Diamond = new Card(6, "6 Diamond");
		Card card7_Diamond = new Card(7, "7 Diamond");
		Card card8_Diamond = new Card(8, "8 Diamond");
		
		Card card9_Diamond = new Card(9, "9 Diamond");
		Card card10_Diamond = new Card(10, "10 Diamond");
		Card cardJack_Diamond = new Card(11, "11 Diamond");
		Card cardQueen_Diamond = new Card(12, "12 Diamond");
		Card cardKing_Diamond = new Card(13, "13 Diamond");
		Card cardAce_Diamond = new Card(14, "Ace Diamond");		
	
		//cards.add(card1_Diamond);
		cards.add(card2_Diamond);
		cards.add(card3_Diamond);
		cards.add(card4_Diamond);
		
		cards.add(card5_Diamond);
		cards.add(card6_Diamond);
		cards.add(card7_Diamond);
		cards.add(card8_Diamond);
		
		cards.add(card9_Diamond);
		cards.add(card10_Diamond);
		cards.add(cardJack_Diamond);
		cards.add(cardQueen_Diamond);
		cards.add(cardKing_Diamond);
		cards.add(cardAce_Diamond);
		
		*/

        for (int i = 2; i < 15; i++) {

            for (String suit : suits) {
            	if (i == 14)
            		cards.add(new Card(i, ("Ace"+ " of "+ suit)));
            	else
            		cards.add(new Card(i, (i+ " of "+ suit)));
            }

        }
		
       // System.out.println(cards.toString());
		
	}
	
	
	
	 public void shuffle() {
	        Collections.shuffle(cards);
	 }

	 public Card draw() {
	        return cards.remove(0);
     }
	 public String toString()
	 {
		
		 StringBuilder builder = new StringBuilder();
		 for (Card card: cards)
		 {
			 builder.append(card.toString());
		 }
		 for(String obj : suits)
		 {
			 builder.append(obj.toString());
		 }
		 
		
		 return builder.toString();
		 
	 }
}