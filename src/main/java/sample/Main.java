package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.app01.BuildUi;
import sample.engine.canvasui.CanvasScreen;
import sample.engine.canvasui.controls.Button;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CanvasScreen drawer = BuildUi.build(primaryStage, 800, 600);
        Button widget = new Button(20, 20, 100, 40);
        drawer.getChildren().add(widget);
        primaryStage.show();
    }
}
