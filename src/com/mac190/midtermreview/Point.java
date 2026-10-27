package com.mac190.midtermreview;

public class Point {
    public double x;
    public double y;

    public Point(){x = 0; y = 0;}
    public Point(double a){x = a; y = a;}
    public Point(double a, double b){x = a; y = b;}

    public Point(Point a){this.Copy(a);}

    public void Copy(Point a){
        this.x = a.x;
        this.y = a.y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)-Math.pow(this.y-p.y, 2));
    }

    public boolean equals(Point other){
        if(this == other)
            return true;
        else return false;
    }

    public Point add(Point other){
        return new Point((this.x+other.x)/2.0, (this.y+other.y)/2.0);
    }
    public static Point add(Point p1, Point p2){ // simply pass the obj. using the function, too!
        // Add the class's name as well.
        return new Point((p1.x+p2.x)/2.0, (p1.y+p2.y)/2.0);
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
}
