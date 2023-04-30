package main.java.com.example.WhiteRectangle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.java.com.example.WhiteRectangle.MainMenuInitialPage_Controller;

import java.io.IOException;

public class WhiteRectangleMain extends Application {
    /*
    This class file should serve as the primary contoller for all other classes. It will launch the game menu
    and once a game is selected, will initiate any functions or methods needed to serve the player with that game.

    This class may not even be needed. TBD
     */

    // TODO - Add Initial start page that asks user whether they want to play and new game, load a game, or view scoreboards
    // TODO - Add New Game select page
    // TODO - Add Load Game select Page
    // TODO - Add View High Scores Game Select Page

    @Override
    public void start (Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/MainMenuInitialPage.fxml"));
        AnchorPane root = loader.load();
        MainMenuInitialPage_Controller controller = loader.getController();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[]args) {
        System.out.println("WhiteRectangle: Running Main Method Now");
        launch(args);
        // TODO -- Make this run the start page
    }


}
