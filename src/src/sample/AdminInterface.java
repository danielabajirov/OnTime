package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

public class AdminInterface {
	
	
	public static void AdminInterface() {
		//new window
		Stage userUI = new Stage();
		userUI.initModality(Modality.APPLICATION_MODAL);
		userUI.setTitle("Admin Interface");
		
		//text field for work begin
		TextField inTime = new TextField();
		inTime.setPromptText("Arbeitsbeginn");
		
		//text field for work end
		TextField outTime = new TextField();
		outTime.setPromptText("Arbeitsende");
		
		//text field for break time
		TextField breakTime = new TextField();
		breakTime.setPromptText("Mittagspause");
		
		//text field Ist-Zeit
		TextField istZeit = new TextField();
		istZeit.setPromptText("Ist-Zeit");
		
		//text field Soll-Zeit
		TextField sollZeit = new TextField();
		sollZeit.setPromptText("Soll-Zeit");
		
		//time management box
		HBox zeitEintragung = new HBox(10);
		zeitEintragung.setPadding(new Insets(20, 20, 20, 20));
        zeitEintragung.getChildren().addAll(inTime, outTime, breakTime, istZeit, sollZeit);
        
        BorderPane interfaceLayout = new BorderPane();
        //top of the Layout
        Label topText = new Label("Titeltext");
        interfaceLayout.setTop(topText);
        //left Side of the Layout
        Label leftText = new Label("left");
        interfaceLayout.setLeft(leftText);
        //right side of the layout
        Label rightText = new Label("right");
        interfaceLayout.setRight(rightText);
        //center of the layout
        interfaceLayout.setCenter(zeitEintragung);
        
        //window layout
        Scene scene = new Scene(interfaceLayout, 300, 250);
        userUI.setScene(scene);
        userUI.show();
		
	}
}
