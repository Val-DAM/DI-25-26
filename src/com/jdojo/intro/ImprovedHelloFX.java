package com.jdojo.intro;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImprovedHelloFX extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label nameLbl = new Label("Introduce o teu nome:");
        TextField nameFld = new TextField();
        Label msg = new Label();
        msg.setStyle("-fx-text-fill: blue;");

        // Crear os botóns
        Button sayHelloBtn = new Button("Dicir Ola");
        Button exitBtn = new Button("Saír");

        // Engadir o controlador para o botón Dicir Ola
        sayHelloBtn.setOnAction(e -> {
            String name = nameFld.getText();
            if (name.trim().length() > 0) {
                msg.setText("Ola " + name);
            } else {
                msg.setText("Ola descoñecido");
            }
        });

        // Engadir o controlador para o botón Saír
        exitBtn.setOnAction(e -> Platform.exit());

        // Crear o nodo raíz
        VBox root = new VBox();

        // Establecer o espazo vertical entre os fillos a 5 píxeles
        root.setSpacing(5);

        // Engadir os fillos ao nodo raíz
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);

        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("Aplicación Hello JavaFX Mellorada");
        stage.show();
    }
}