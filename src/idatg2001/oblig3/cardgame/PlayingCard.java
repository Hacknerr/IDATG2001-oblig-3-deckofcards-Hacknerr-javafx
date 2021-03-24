package idatg2001.oblig3.cardgame;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class PlayingCard {

    private String faceName;
    private String suit;
    private Image image;


    public PlayingCard(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        String fileName = faceName + suit + ".png";
        image = new Image("./images/"+fileName);
    }

    public String getFaceName() {
        return faceName;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * This method returns a list of face names that are valid for
     * card objects.
     */
    public static List<String> getValidFaceNames(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
    }

    /**
     * This method will return a list of valid suits.
     * @return spades, hearts, clubs, diamonds.
     */
    public static List<String> getValidSuits(){
        return Arrays.asList("H", "D", "S", "C");
    }

    /**
     * This method will validate the argument and set the instance variable.
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        if(validFaceNames.contains(faceName)){
            this.faceName = faceName;
        }else{
            throw new IllegalArgumentException("Valid face names are: " + validFaceNames);
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        if(validSuits.contains(suit)){
            this.suit = suit;
        }else{
            throw new IllegalArgumentException("Valid suits are: " + getValidSuits());
        }
    }

    @Override
    public String toString() {
        return String.format("%s of %s", faceName, suit);
    }

}
