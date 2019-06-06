package sample;

import chars.Spielfeld;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Spielfeld feld;
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hallo");

        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        feld = new Spielfeld();
    }

}
