package sample.app01;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.engine.canvasui.CanvasScreen;

public class BuildUi {
    public static CanvasScreen build(Stage stage, int width, int height) {
        CanvasScreen canvasScreen = new CanvasScreen(width, height);
        AnchorPane parent = new AnchorPane(canvasScreen.getCanvas());

        Scene screenScene = new Scene(parent);
        screenScene.setOnMouseClicked(event -> {
            canvasScreen.onMouseEvent(event);
            //System.out.println("Click:"+event.getSceneX()+" - "+event.getSceneY());
        });
        screenScene.setOnMouseMoved(event -> {
            canvasScreen.onMouseEvent(event);
            //System.out.println("Move:"+event.getSceneX()+" - "+event.getSceneY());
        });
        screenScene.setOnMouseEntered(event -> {
            canvasScreen.onMouseEvent(event);
            //System.out.println("Enter:"+event.getSceneX()+" - "+event.getSceneY());
        });
        screenScene.setOnMouseExited(event -> {
            canvasScreen.onMouseEvent(event);
            //System.out.println("Enter:"+event.getSceneX()+" - "+event.getSceneY());
        });
        screenScene.setOnMouseReleased(event -> {
            canvasScreen.onMouseEvent(event);
            //System.out.println("Released:"+event.getSceneX()+" - "+event.getSceneY());
        });

        stage.setScene(screenScene);
        return canvasScreen;
    }
}
