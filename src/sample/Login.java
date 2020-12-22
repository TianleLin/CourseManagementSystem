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
import java.util.ArrayList;

public class Login extends Application {
    public static  Stage loginStage;
    public static MyFile accountFile;
    double xOffset;
    double yOffset;
    public void start(Stage oneStage) throws Exception{
        loginStage=oneStage;
        accountFile=new MyFile("account.txt");
        showLoginStage(loginStage);
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
    public static void main(String[] args) throws IOException {
        /*System.out.println("90");
        MyFile accountFile=new MyFile("account.txt");
        ArrayList<Account> oneList = new ArrayList<>();
        Account a1= new Account("CareEJoken", "A13d980cZk++","Student");
        Account a2= new Account("余时伟", "pai","Teacher");
        Account a3= new Account("周歆", "233333","Administrator");
        oneList.add(a1);
        oneList.add(a2);
        oneList.add(a3);
        accountFile.write(oneList);
        ArrayList list = accountFile.read();
        for (Object oneAccount:list) {
            System.out.println(oneAccount.getClass().getName());
            if (oneAccount.getClass().getName()=="sample.Account")
            {
                Account one=(Account)oneAccount;
                System.out.println(one.getName()+" "+one.getPassword());
            }
        }*/
        launch(args);
    }
}
