package com.example.graph;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Canvas canvas;
    public AnchorPane anchorPane;
    GraphicsContext gc;
    Points a;
    Points b;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> anchorPane.requestFocus());
        gc = canvas.getGraphicsContext2D();
        a = new Points(100, 200, 20, 20, Paint.valueOf("RED"), 10);
        b = new Points(200, 100, 20, 20, Paint.valueOf("GREEN"), 50.0f);
        gc.setFill(a.getC());
        gc.fillOval(a.getX(), a.getY(), a.getW(), a.getH());

        gc.setFill(b.getC());
        gc.fillOval(b.getX(), b.getY(), b.getW(), b.getH());

        gc.setStroke(Paint.valueOf("BLUE"));
      //  gc.beginPath();
       // gc.moveTo(a.getX() + a.getW() / 2,a.getY() + a.getH() / 2,b.getX() + b.getW() / 2,b.getY() + b.getH() / 2);
        //gc.lineTo(b.getX(), b.getY());
        gc.setLineWidth(2);
        gc.strokeLine(a.getX() + a.getW() / 2,a.getY() + a.getH() / 2,b.getX() + b.getW() / 2,b.getY() + b.getH() / 2);
    }
}