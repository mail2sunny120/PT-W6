/**
 * 
 */
package com.promineotech;

public class Card {
	
	//contains a value from 2-14 representing cards 2-Ace
	private int value;
	//e.g. Ace of Diamonds, or Two of Hearts
	private String name;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe()
	{
		System.out.println("CardName=" +this.getName() + "  " + "CardValue ="+this.getValue());
		
	}
	
	
	public Card(int value, String name)
	{
		this.value = value;
		this.name = name;
		
	}
	public String toString()
	{
		
		return name + " " + value;
	}
	

}
