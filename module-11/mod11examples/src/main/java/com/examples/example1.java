package com.examples;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class example1 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("BorderPane example");

        //create labels that will go in each of the areas
        Label topLabel = new Label("--this is the top area --");
        Label leftLabel = new Label("--this is the left area--");
        Label rightLabel = new Label("--This is the right area--");
        Label bottomLabel = new Label("--This is the bottom area--");
        Label centerLabel = new Label("--This is the center area--");

        //create a borderpane object that holds the labels in each area
        BorderPane bp = new BorderPane(centerLabel, topLabel, rightLabel, bottomLabel, leftLabel);

        //set allignment within the areas
        bp.setAlignment(topLabel,Pos.CENTER);
        bp.setAlignment(bottomLabel,Pos.CENTER);
        bp.setAlignment(rightLabel,Pos.CENTER);
        bp.setAlignment(leftLabel,Pos.CENTER);
        bp.setAlignment(centerLabel,Pos.CENTER);

 

        //initialize bp as scene
        Scene scene = new Scene(bp, 1000, 1000); 
        stage.setScene(scene);
        stage.show();

    }

    
    public static void main(String[] args) {
        launch();
    }


}