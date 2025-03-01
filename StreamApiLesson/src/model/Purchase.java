package model;

public class Purchase {
    public String buyer;
    public String name;
    public int price;

    public Purchase(String buyer, String name, int price) {
        this.buyer = buyer;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purchase:" + name + "," + price;
    }
}
