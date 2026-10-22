package com.mac190.midtermreview;

import org.w3c.dom.css.Rect;

import java.util.Objects;

public class Rectangle {
    private double length, width;

    //default constructor
    public Rectangle(){
        length = width = 0;
    }
    public Rectangle(double a){
        length = width = a;
    }
    public Rectangle(double a, double b){
        width = a;
        length = b;
    }
    //copy constructor
    public Rectangle(Rectangle R){
        length = R.length;
        width = R.width;
    }


    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = Math.abs(width);
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public boolean equals(Rectangle R) {
        if (R == null ) return false;
        return Double.compare(length, R.length) == 0 && Double.compare(width, R.width) == 0;
    }
    public double perim(){
        return 2*length + 2*width;
    }
    public double area(){
        return length * width;
    }
    public Rectangle add(Rectangle R){
        return new Rectangle(width+R.getWidth(), length + R.length);
    }
    public static Rectangle add(Rectangle T, Rectangle R){
        return new Rectangle(T.width+R.getWidth(), T.length + R.length);
    }
}
