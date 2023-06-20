package com.shamilla.drawingapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DrawingApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Create a circle to represent the drawing cursor
        Circle cursor = new Circle(10, Color.BLACK);
        cursor.setOpacity(0.5);
        root.getChildren().add(cursor);

        // Register mouse event handlers
        root.setOnMouseMoved(event -> {
            // Update the position of the cursor based on mouse movement
            cursor.setCenterX(event.getX());
            cursor.setCenterY(event.getY());
        });

        root.setOnMouseClicked(event -> {
            // Create a new circle when the mouse is clicked
            Circle circle = new Circle(20, Color.BLUE);
            circle.setCenterX(event.getX());
            circle.setCenterY(event.getY());
            root.getChildren().add(circle);
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Drawing Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
