package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    public static String accountType="teacher";
    public static String accountName="余时伟";
    double xOffset;
    double yOffset;
    Stage stage= new Stage();
    public void start(Stage mainStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        mainStage.setTitle("Lin");
        mainStage.initStyle(StageStyle.TRANSPARENT);
        mainStage.setScene(new Scene(root));
        mainStage.show();
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                xOffset = mouseEvent.getSceneX();
                yOffset = mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                mainStage.setX(mouseEvent.getScreenX() - xOffset);
                mainStage.setY(mouseEvent.getScreenY() - yOffset);
            }
        });
    }
    public void showWindow() throws Exception {
        start(stage);
    }

}
