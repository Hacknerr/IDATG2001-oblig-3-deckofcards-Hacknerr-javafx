package idatg2001.oblig3.cardgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {

    public ImageView activeCardImageView1;
    public ImageView activeCardImageView2;
    public ImageView activeCardImageView3;
    public ImageView activeCardImageView4;
    public ImageView activeCardImageView5;

    @FXML private Button nextCardButton;
    private DeckOfCards deck;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        deck.shuffle();
        activeCardImageView1.setImage(deck.getBackOfCardImage());
        activeCardImageView2.setImage(deck.getBackOfCardImage());
        activeCardImageView3.setImage(deck.getBackOfCardImage());
        activeCardImageView4.setImage(deck.getBackOfCardImage());
        activeCardImageView5.setImage(deck.getBackOfCardImage());
    }

    @FXML public void nextCardButtonPushed(){
            this.activeCardImageView1.setImage(deck.dealTopCard().getImage());
            this.activeCardImageView2.setImage(deck.dealTopCard().getImage());
            this.activeCardImageView3.setImage(deck.dealTopCard().getImage());
            this.activeCardImageView4.setImage(deck.dealTopCard().getImage());
            this.activeCardImageView5.setImage(deck.dealTopCard().getImage());
    }

}
