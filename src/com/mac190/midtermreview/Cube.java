package com.mac190.midtermreview;
















//public class Cube {
//    private Rectangle base;
//    private double height;
//    //default constructor
//    public Cube(){
//        base = new Rectangle();
//        height = 0;
//    }
//    public Cube(double a){
//        base = new Rectangle(a);
//        height = a;
//    }
//    public Cube(double a, double b, double c){
//        base = new Rectangle(a, b);
//        height = c;
//    }
//    public Cube(Rectangle R, double a){
//        base = new Rectangle(R);
//        height = a;
//    }
//    //copy constructor
//    public Cube(Cube c){
//        base = new Rectangle(c.getBase());
//        height = c.getHeight();
//    }
//
//    public Rectangle getBase() {
//        return base;
//    }
//    public void setBase(Rectangle base) {
//        this.base = base;
//    }
//    public double getLength(){
//        return base.getLength();
//    }
//    public void setLength(double l){
//        base.setLength(l);
//    }
//    public double getWidth(){
//        return base.getWidth();
//    }
//    public void setWidth(double w){
//        base.setWidth(w);
//    }
//    public double getHeight() {
//        return height;
//    }
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public String toString() {
//        return "Cube{" +
//                "base=" + base +
//                ", height=" + height +
//                '}';
//    }
//    public boolean equals(Cube C){
//        if(C == null) return false;
//        return this.base.equals(C.base) && this.height == C.height;
//    }
//    public double area(){
//        return base.area()*2 + 2*base.getLength()*height + 2*base.getWidth()*height;
//    }
//    public double volume(){
//        return base.area() *height;
//    }
//    public Cube add(Cube C){
//        return new Cube(this.base.add(C.base), this.height + C.height);
//    }
//    //as static method
//    public static Cube add(Cube T, Cube C){
//        return new Cube(T.base.add(C.base), T.height + C.height);
//    }