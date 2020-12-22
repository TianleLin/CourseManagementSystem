package sample;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class LoginController {
    @FXML
    private FontAwesomeIconView loginCloseButton;

    @FXML
    void closeClicked(MouseEvent event) {
        if (event.getSource()==loginCloseButton)
            System.exit(0);
    }
}
