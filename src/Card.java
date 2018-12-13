public class Card {

    //Fields
    String rank;
    String suit;
    int pointValue;

    //Constructs fields
    public Card(String rank, String suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    //Getter for rank
    public String getRank() {
        return rank;
    }

    //Getter for suit
    public String getSuit() {
        return suit;
    }

    //Getter for pointValue
    public int getPointValue() {
        return pointValue;
    }

    public boolean equals(Card otherCard){
        if(this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit) && this.pointValue == otherCard.pointValue){
            return true;
        }
        return false;
    }
     public String toString(){
        return "Rank: " + rank + " Suit: " + suit + " Value: " + pointValue + "";
     }
}
