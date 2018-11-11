package main.java.kat2n.practice_java.quiz4.question4_5;

public class Deck {
  private Card[] deck;
  public final static int NUMCARDS = 52;

  public Deck() {
    deck = new Card[NUMCARDS];
    for (int i = 0; i < deck.length; i++) {
      deck[i] = new Card("a", 1);
    }
  }

  public void shuffle() {
    //Other methods are not shown.
  }

  public void writeDeck(){

//    System.out.println(deck);

    for (Card card : deck)
      System.out.println(card);

//    for (Card card : deck)
//      System.out.println((String) card);

  }

}
