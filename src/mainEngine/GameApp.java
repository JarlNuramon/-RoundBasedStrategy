package mainEngine;

import javafx.stage.Stage;

import java.awt.List;
import java.util.LinkedList;

import dungeonEngine.EventGenerator;
import events.Events;
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*; 
import javafx.scene.*;
import javafx.scene.control.*;

public class GameApp extends Application{
	private LinkedList<Button> bDecision= new LinkedList<Button>();
	private LinkedList<Button> bCombat = new LinkedList<Button>();
	private TextField eventDesc = new TextField();
	private Events accScene;
	public static String language = "Deutsch"; 
	public static void main(String[] args) {
		launch(args);
		}
		@Override
		public void start(Stage st) throws Exception {
			eventDesc.setPrefSize(200, 200);
			VBox box = new VBox();
			box.setPadding(new Insets(4,4,4,4));
			box.setSpacing(4);
			Scene main = new Scene(box);
			VBox scrollAdd = new VBox();
			scrollAdd.getChildren().add(eventDesc);
			ScrollPane p = new ScrollPane(scrollAdd);
			
			EventGenerator e = new EventGenerator();
			e.addEvent();
			accScene = e.getScene();
			eventDesc.setText(accScene.getStartString());
			box.getChildren().add(p);
			st.setScene(main);
			st.centerOnScreen();
			st.setResizable(false);
			st.show();
		}
}
