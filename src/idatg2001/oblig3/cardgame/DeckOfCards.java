package idatg2001.oblig3.cardgame;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    private ArrayList<PlayingCard> deck;
    private Image backOfCardImage;

    /**
     * This is a 1 argument constructor that passes in a collection
     * of PlayingCard objects.
     * @param deck
     */
    public DeckOfCards(ArrayList<PlayingCard> deck) {
        this.deck = deck;
        backOfCardImage = new Image("./images/blue_back.png");
    }

    /**
     * This is a zero argument constructor that will build a full Deck of Cards.
     */
    public DeckOfCards(){
        List<String> suits = PlayingCard.getValidSuits(); //this is calling a static method
        List<String> faceNames = PlayingCard.getValidFaceNames();
        deck = new ArrayList<>();
        for(String suit : suits){
            for(String faceName : faceNames){
                deck.add(new PlayingCard(faceName, suit));
            }
        }
        backOfCardImage = new Image("./images/blue_back.png");
    }

    public ArrayList<PlayingCard> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<PlayingCard> deck) {
        this.deck = deck;
    }

    public Image getBackOfCardImage() {
        return backOfCardImage;
    }

    public void setBackOfCardImage(Image backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }

    /**
     * This method will "deal" the top card off the deck.
     */
    public PlayingCard dealTopCard(){
        Random random = new Random();
        if(deck.size() > 0){
            return deck.remove(random.nextInt(deck.size()));
        }else{
            return null;
        }
    }

    /**
     * this method will shuffle the deck of cards
     */
    public void shuffle(){
        Collections.shuffle(deck);
    }

}
