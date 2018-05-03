package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.HashSet;


public class Main extends Application {
    Stage window;
    Button button;



    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Login");

        TextField idInput = new TextField();
        idInput.setPromptText("ID");
        PasswordField pwInput = new PasswordField();
        pwInput.setPromptText("PW");

        button = new Button("Login");

        button.setOnAction(e -> {
            if(idInput.getText().equals("admin") && pwInput.getText().equals("123")) {
                window.close();
                boolean result = ConfirmBox.display("Login", "Easy login");

                System.out.println(result);

/** TODO
 * Implementieren die LoggMethode mit Read and Write auf ein Textdatei
 * versuch hier die interfaces zu verbindem wie oben gemacht wurde
 */

            }else

                System.out.println("nice try");
        });
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(idInput, pwInput, button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
