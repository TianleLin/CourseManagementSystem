package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Login extends Application {

    double xOffset;
    double yOffset;
    public void start(Stage oneStage) throws Exception{
        showLoginStage(oneStage);
    }
    public void showLoginStage(Stage loginStage) throws IOException {
        Parent rootLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
        loginStage.setTitle("Lin");
        loginStage.initStyle(StageStyle.TRANSPARENT);
        loginStage.setScene(new Scene(rootLogin));
        loginStage.show();
        rootLogin.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                xOffset = mouseEvent.getSceneX();
                yOffset = mouseEvent.getSceneY();
            }
        });
        rootLogin.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                loginStage.setX(mouseEvent.getScreenX() - xOffset);
                loginStage.setY(mouseEvent.getScreenY() - yOffset);
            }
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
