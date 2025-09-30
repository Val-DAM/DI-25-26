package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ej3 extends Application {
	
	public static void main(String[] args) {
        Application.launch(args);
    }
	
	@Override
    public void start(Stage stage) {
		
		int num = 0;
  
		Label nameLbl = new Label("Click Me!");
        TextField nameFld = new TextField();
        nameFld.getText();
        
        // Crear os botóns
        Button sumaBtn = new Button("Incrementar");
     
        // Crear o nodo raíz
        VBox root = new VBox();

        sumaBtn.setOnAction(e -> {
            String name = nameFld.getText();
            if (name.trim().length() > 0) {
                msg.setText("Ola " + name);
            } else {
                msg.setText("Ola descoñecido");
            }
        });
        
        // Establecer o espazo vertical entre os fillos a 5 píxeles
        root.setSpacing(10);

        // Engadir os fillos ao nodo raíz
        root.getChildren().addAll(nameLbl, sumaBtn);

        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Click Me!");
        stage.show();
    }
}