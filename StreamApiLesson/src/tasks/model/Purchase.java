package tasks.model;

public class Purchase {public String buyer;
    public String product;
    public String shop;
    public int count;

    public Purchase(String buyer, String product, String shop, int count) {
        this.buyer = buyer;
        this.product = product;
        this.shop = shop;
        this.count = count;
    }
}

