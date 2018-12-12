import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] ranks, String[] suits, int[] pointValue)
    {
        unDealt = new ArrayList<Card>();
        Dealt = new ArrayList<Card>();
        for(int i = 0;i<ranks.length;i++)
        {
            for(int x = 0;x<suits.length;x++)
            {
                Card newCard = new Card(ranks[x],suits[i],pointValue[x]);
                unDealt.add(newCard);
            }
        }
    }
    public boolean isEmpty()
    {
        if (unDealt.size() == 0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return (unDealt.size());
    }
    public

}
