package org.example.week4.lab4.Shape;

enum FillType {
    FILLED, NOT_FILLED
}
class Shape {
    private String color;
    private FillType filled;


    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FillType getFilled() {
        return filled;
    }

    public void setFilled(FillType filled) {
        this.filled = filled;
    }

    public String displayInfo (){
        return this.color + "\n \t" + this.getFilled();
    }

    public double getArea (){
        return 0;
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * 3.14;
    }

    public double calculateCircumference (double Pi, double radius){
        Pi=3.14;
        return Pi*2*this.radius;
    }

    public double calculateCircumference (double radius){
        return 3.14*2*this.radius;
    }

    @Override
    public String toString(){
        return this.getColor() + "\n \t" + getFilled() + "\n \t" + this.radius + "\n \t" + this.getArea();
    }

}

class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, FillType filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public String displayInfo(){
        return this.getColor() + "\n \t" + getFilled();
    }

    @Override
    public String toString() {
        return this.displayInfo() + "\n \t" + this.getArea() + "\n \t" + this.height + "\n \t" + this.width;
    }

}

