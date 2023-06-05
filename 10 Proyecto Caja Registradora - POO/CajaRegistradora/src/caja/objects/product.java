package caja.objects;

public abstract class product implements Cloneable {
    private String name;
    private int amount;
    private double price;

    public product() {
        
    }

    public  product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            System.out.println("No puede asignar una cantidad negativa");
            return;
        }
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("No se puede asignar un precio negativo negativa");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nCantidad: " + amount + "\nPrecio: " + price;
    }

    public product clone() throws CloneNotSupportedException {
        return (product) super.clone();
    }
}
