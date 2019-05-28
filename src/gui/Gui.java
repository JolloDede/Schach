package gui;

import draw.DrawMain;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui {
    public static int width = 1280, height = 720, schachWidth = 720;
    private static GraphicsContext gcMain;
    private static DrawMain dm;

    public void init(){

    }

    public void create(Stage stage){
        Canvas canvasMain;
        StackPane root = new StackPane();
        int cWidth = width - 10, cHeight = height - 10;

        canvasMain = new Canvas(width, height);
        gcMain = canvasMain.getGraphicsContext2D();
        dm.draw(gcMain);
    }
}
