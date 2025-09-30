package com.jdojo.intro;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ej2 extends Application {
	
	public static void main(String[] args) {
        Application.launch(args);
    }
	
	@Override
    public void start(Stage stage) {
        
        // Crear os botóns
        Button rojoBtn = new Button("Vermello");
        Button verdeBtn = new Button("Verde");
        Button azulBtn = new Button("Azul");
     
        // Crear o nodo raíz
        VBox root = new VBox();

		
        verdeBtn.setOnAction(e -> root.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null))));
        
        rojoBtn.setOnAction(e -> root.setBackground(new Background(new BackgroundFill(Color.RED, null, null))));
        
        azulBtn.setOnAction(e -> root.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null))));
        
        // Establecer o espazo vertical entre os fillos a 5 píxeles
        root.setSpacing(5);

        // Engadir os fillos ao nodo raíz
        root.getChildren().addAll(rojoBtn, verdeBtn, azulBtn);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Cambiar cor de fondo");
        stage.show();
    }
}