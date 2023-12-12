package org.example.midterm_preperation.generics.Pair;

/*Design a generic class named `Pair<K, V>` representing a key-value pair.
 Implement a method that checks if two pairs are equal based on their keys and values.
  Extend this class to create a subclass `ColorPair<K, V>` that includes a color attribute.
   Demonstrate inheritance and overriding by comparing pairs and color pairs.
 */
class Pair<K, V>{
    private K key;
    private V value;

    public Pair (K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    public void setKey(K key){
        this.key=key;
    }

    public void setValue(V value){
        this.value=value;
    }


    public boolean equals(Object someKey){
        if(this.key == someKey)
            return true;
        else
            return false;
    }

    public boolean equals(Pair<K,V> comparedPair){
        return this.key.equals(comparedPair.getKey()) && this.value.equals(comparedPair.getValue());
    }
}

class ColoredPair<K, V> extends Pair<K, V>{
    private String color;

    public ColoredPair(K key, V value, String color) {
        super(key, value);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o){
        if (this.getClass()!=o.getClass()){
            return false;
        }

        ColoredPair<K, V> comparedColoredPair = (ColoredPair<K, V>) o;

        if(this.color==comparedColoredPair.color &&
                this.getKey()==comparedColoredPair.getKey() &&
        this.getValue()==comparedColoredPair.getValue()){
            return true;
        }
        else
            return false;
    }
}

class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Integer, String> pair2 = new Pair<>(1, "One");
        Pair<Integer, String> pair3 = new Pair<>(2, "Two");

        System.out.println("Pair 1 equals Pair 2: " + pair1.equals(pair2)); // Should be true
        System.out.println("Pair 1 equals Pair 3: " + pair1.equals(pair3)); // Should be false

        ColoredPair<Integer, String> colorPair1 = new ColoredPair<>(1, "One", "Red");
        ColoredPair<Integer, String> colorPair2 = new ColoredPair<>(1, "One", "Blue");
        ColoredPair<Integer, String> colorPair3 = new ColoredPair<>(2, "Two", "Red");

        System.out.println("ColorPair 1 equals ColorPair 2: " + colorPair1.equals(colorPair2)); // Should be false
        System.out.println("ColorPair 1 equals ColorPair 3: " + colorPair1.equals(colorPair3)); // Should be false
    }
}
