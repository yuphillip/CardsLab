public class Card {
    private String rank;
    private String suit;
    private int pointValue;
    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
    public boolean equals(Card otherCard)
    {
        if(pointValue == otherCard.pointValue)
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return ("Rank:" + rank + " " + "Suit:" + suit + " " + "PointValue:" + pointValue);
    }
}
