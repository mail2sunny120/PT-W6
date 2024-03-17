/**
 * 
 */
package com.promineotech;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 2.a
		Deck deck = new Deck();
		//System.out.println(deck);
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        deck.shuffle();
        
        //Step 2.b 
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        /*
         * ********************
         * Step 2.c
         * ********************
         */
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue())
            {
                player1.incrementScore();
                System.out.println("Player 1 scored a point");
            } 
            else if (player1Card.getValue() < player2Card.getValue())
            {
                player2.incrementScore();
                System.out.println("Player 2 scored a point");
            }
            // tie
            else
            {
            	System.out.println("no point was awarded");
            }
        }

        /*
         * ********************
         *2d
         * ********************
         */
        System.out.printf("Player1 score = %d\n", player1.getScore());
        System.out.printf("Player2 score = %d\n", player2.getScore());
        
        /****
         * 2.e
         */
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player1 is the winner!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player2 is the winner!");
        } else {
            System.out.println("It is a DRAW!");
        }        
	}

}
