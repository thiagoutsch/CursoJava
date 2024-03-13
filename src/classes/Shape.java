package classes;

import enums.Color;

public abstract class Shape {   //classe abstrata pq tem o método área que é abstrato
    private Color color;

    public Shape() {

    }

    

    public Shape(Color color) {
        this.color = color;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
