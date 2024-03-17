/**
 * 
 */
package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player
{

	List<Card> hands = new ArrayList<Card>();
	private int score;
	String name ;
	
	//default
	Player()
	{
		score=0;
		name ="";
	}
	
	Player(String name)
	{
		this.score = 0;
		this.name = name;
		
	}
	
	public void  describe ()
	{
		System.out.println("PlayerScore ="+score + "   " + "PlayerName="+name);
		for(Card card: hands)
		{
			
			card.describe();
		}
		
		
	}

	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	public void incrementScore ()
	{
		score ++;
	}

	
///
	
	public Card flip() {
        return hands.remove(0);
    }

    public void draw(Deck deck) {
        hands.add(deck.draw());
    }



	
}
