package org.example.midterm_preperation.generics.Box;

/*Create a generic class named `Box<T>` that represents a simple box.
Implement methods for putting an item into the box and retrieving the item
 from the box. Extend this class to create a `ColoredBox<T>` that includes a
  color attribute. Demonstrate inheritance and overriding by putting and retrieving
  items from both generic and colored boxes.
 */


import java.util.Optional;

class Box<T> {
    private T item;

    public Box (T item) {
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }

    public void setItem(T item){
        this.item=item;
    }

    @Override
    public String toString(){
        return "Item: " + this.item;
    }

}

class ColoredBox<T> extends Box{
    private String color;


    public ColoredBox(T item, String color){
        super(item);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Item: " + this.getItem() + "\n" + "Color: " + this.color;
    }


}

class Main {
    public static void main(String[] args) {
        Box b = new Box<>("blablabla");
        Box bb = new Box<>(144234235);


        ColoredBox cb1 = new ColoredBox<>("Mirna stupider jupiter", "black");
        ColoredBox cb2 = new ColoredBox<>("Luka kralj", "green");

        System.out.println(cb1);
        cb1.setItem("Mirna se ne kupa!!!");
        System.out.println();
        cb1.setColor("smrad");
        System.out.println(cb1);
    }
}
