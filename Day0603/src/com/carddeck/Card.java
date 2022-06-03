package com.carddeck;

public class Card {
	public final int suitNumber;
	public final int rankNumber;
	   
	public Card(int suitNumber, int rankNumber) {
	    this.suitNumber = suitNumber;
	    this.rankNumber = rankNumber;
	}
	   
	public String getSuit() {
		switch(suitNumber) {
			case 1:
	         return "Clover";
			case 2:
	         return "Diamond";
			case 3:
	         return "Heart";
			case 4:
	         return "Spade";
	        default:
	         return"";
	      }
	   }
	   
	public String getRank() {
	    switch(rankNumber) {
	      	case 1:
	         return "Ace";
	      	case 11:
	         return "Jack";
	      	case 12:
	         return "Queen";
	      	case 13:
	         return "King";
	        default:
	         return String.valueOf(rankNumber);
	    }
	}
	   
	public String toString() {
	    return getRank() + " " + getSuit()+"  ";
	}
	   
	   
}
