package org.example.midterm_preperation.encapsulation.shape;

/*Implement a shape hierarchy for 2D shapes. Create an enum class `DrawingTool`
 with different drawing tools. Create an interface `Drawable` with a method `draw()`
  that prints a message about drawing the shape using the specified tool. Create a base
   class `Shape` with attributes `color` and `drawingTool`, and methods for getting the area
   and displaying details. Extend this class to create specific shapes like `Circle` and `Rectangle`.
    Implement method overriding, encapsulation, and demonstrate the use of enums for color and drawing
    tool in each shape.
 */
interface Drawable {
    public void draw();
}

enum DrawingTool{
    PENCIL, PENTOOL, BRUSH, CHARCOAL
}

abstract class Shape implements Drawable{
    private String color;
    private DrawingTool drawingTool;

    public Shape (String color, DrawingTool drawingTool){
        this.color=color;
        this.drawingTool=drawingTool;
    }

    public String getColor (){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public DrawingTool getDrawingTool(){
        return this.drawingTool;
    }
    public void setDrawingTool(DrawingTool dt){
        this.drawingTool=dt;
    }
    public void draw(){
        System.out.println("This is a shape.");
    }
    public double area(){
        return 0;
    }

    @Override
    public String toString(){
        return "Color: " + this.color + "\n" + "Drawing tool: " + this.drawingTool;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle (String color, DrawingTool dt, double r){
        super(color, dt);
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }
    public void serRadius(double r){
        this.radius=r;
    }
    public void draw(){
        System.out.println("Draw circle.");
    }
    public double area(){
        return this.radius*this.radius*3.14;
    }
    public String toString(){
        return "Color: " + this.getColor() + "\n" +
                "Drawing tool: " + this.getDrawingTool() + "\n" +
                "Radius: " + this.radius;
    }
}

class Main{
    public static void main(String[] args) {
        Circle c = new Circle("royal blue", DrawingTool.PENTOOL, 1.3);
        System.out.println(c);
        System.out.println("Area :" + c.area());
        c.draw();
    }
}
