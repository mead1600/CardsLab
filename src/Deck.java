import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> unDealt = new ArrayList<>();
    private ArrayList<Card> Dealt = new ArrayList<>();

    public Deck(String[] rank, String[] suit, int[] pointValue){
        ArrayList<Card> cards = new ArrayList<>();
        int possibilities = rank.length * suit.length * pointValue.length;
        for(int i = 0; i < possibilities; i++){
            Card addition = new Card(rank[(int)(Math.random()*rank.length - 1)],suit[(int)(Math.random()*rank.length - 1)],pointValue[(int)(Math.random()*rank.length - 1)]);
            System.out.println(addition.toString());
            unDealt.add(addition);
        }
    }

    public boolean isEmpty(){
        if(unDealt.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return unDealt.size();
    }

    public Card deal(){
        Card val = unDealt.get(unDealt.size() - 1);
        Dealt.add(val);
        unDealt.remove(unDealt.size() - 1);
        return val;
    }

    public void shuffle() {
        for(int k = unDealt.size()-1; k > 0; k--){
            int r = (int)(Math.random()*k);
            unDealt.add(Dealt.get(r));
            Dealt.remove(r);
        }
    }

    /*public String toString(){
        String[] cards = new String[unDealt.size()];
        for(int i = 0; i < unDealt.size(); i++){
            cards[i] = ""+unDealt.get(i).getRank()+", "+unDealt.get(i).getSuit()+", "+unDealt.get(i).getPointValue()+"";
        }
        return cards;
    }*/
    
}
