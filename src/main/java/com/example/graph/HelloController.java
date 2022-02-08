package com.example.graph;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Canvas canvas;
    public AnchorPane anchorPane;
    GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(()-> anchorPane.requestFocus());
        gc = canvas.getGraphicsContext2D();
        gc.setStroke(Paint.valueOf("RED"));
        gc.beginPath();
        gc.moveTo(50,30);
        gc.lineTo(100,200);
        gc.setLineWidth(2);
        gc.stroke();
    }
}