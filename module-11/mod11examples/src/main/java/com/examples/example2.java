package com.examples;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class example2 extends Application {


    
    @Override
    public void start(Stage stage) throws IOException{

        stage.setTitle("GridPane example");
        
        //create labels for demonstration
        Label label1 = new Label("[Row 1, Col 1] ");
        Label label2 = new Label("[Row 2, Col 1] ");
        Label label3 = new Label("[Row 3, Col 1] ");
        Label label4 = new Label("[Row 4, Col 1] ");
        Label label5 = new Label("[Row 1, Col 2] ");
        Label label6 = new Label("[Row 2, Col 2] ");
        Label label7 = new Label("[Row 3, Col 2] ");
        Label label8 = new Label("[Row 4, Col 2] ");
        Label spanningLabel = new Label("[This label spans multiple columns :D]");

        //create new GridPane object
        GridPane grid = new GridPane();
        //add all labels to their respective positions
        grid.add(label1, 1, 1); 
        grid.add(label2, 1, 2); 
        grid.add(label3, 1, 3);       
        grid.add(label4, 1, 4);
        grid.add(label5, 2, 1);
        grid.add(label6, 2, 2);
        grid.add(label7, 2, 3);
        grid.add(label8, 2, 4);
        grid.add(spanningLabel, 1, 5);

        //make the spanning label take up multiple columns
        grid.setColumnSpan(spanningLabel, 3);

        //initialize grid as a scene
        Scene scene = new Scene(grid, 300, 300); 
        stage.setScene(scene);
        stage.show();

    }

    
    public static void main(String[] args) {
        launch();
    }


}
