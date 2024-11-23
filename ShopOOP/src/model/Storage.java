package model;

public class Storage {

    public void addProducts(Product[] products, Product product) {
        products[product.getPosition()] = product;
    }

    public void getProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    public void buyProducts(Product[] products, Product product) {
        products[product.getPosition()].removeOne();
    }
}
