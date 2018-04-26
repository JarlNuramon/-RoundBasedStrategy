package mainEngine;

import javafx.stage.Stage;
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*; 
import javafx.scene.*;
import javafx.scene.control.*;

public class GameApp extends Application{
	public static void main(String[] args) {
		launch(args);
		}
		@Override
		public void start(Stage st) throws Exception {
			VBox box = new VBox();
			Scene main = new Scene(box);
			st.setScene(main);
			st.setX(100);
			st.setY(100);
			st.setResizable(false);
			st.show();
		}
}
