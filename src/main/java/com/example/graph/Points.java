package com.example.graph;

import javafx.scene.paint.Paint;

public class Points {
    private double x;
    private double y;
    private double w;
    private double h;
    private Paint c;
    private float v;

    public Points(double x, double y, double w, double h, Paint c, float v) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
        this.v = v;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Paint getC() {
        return c;
    }

    public void setC(Paint c) {
        this.c = c;
    }

    public float getV() {
        return v;
    }

    public void setV(float v) {
        this.v = v;
    }
}
