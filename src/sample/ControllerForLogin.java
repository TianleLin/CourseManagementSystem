package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class ControllerForLogin {
    @FXML
    private JFXButton loginButton;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private JFXTextField name;

    @FXML
    private JFXPasswordField password;
    @FXML
    private FontAwesomeIconView closeButton;

    public void closeClick(MouseEvent mouseEvent) {
        if (mouseEvent.getSource()==closeButton)
            System.exit(0);
    }
    public void handleClicks(MouseEvent mouseEvent) throws Exception {
        boolean foundFlag = false;
        if (mouseEvent.getSource() == loginButton) {
            ArrayList allAccount = Login.ac·countFile.read();
            for (Object oneAccount : allAccount) {
                if (oneAccount.getClass().getName() == "sample.Account") {
                    Account one = (Account) oneAccount;
                    if (one.getName().equals(name.getText()) && one.getPassword().equals(password.getText())) {
                        Main mainWindows = new Main();
                        Main.accountType=one.getType();
                        Main.accountName=one.getName();
                        mainWindows.showWindow();

                        Login.loginStage.close();
                        foundFlag = true;
                        break;
                    }
                }
            }
            if (foundFlag == false) {
                name.setText("Account not found or invaild password");
                password.setText("");
            }
        }
    }
    public void addClicks(MouseEvent mouseEvent) {
    }

}
