package classes;

public class Produto3 {
    private String name;
    private double price;
    private int quantity;

    public Produto3(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto3(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; //opicional
                        // palavra this opicional tb
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f",price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}