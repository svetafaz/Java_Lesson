package service;

import model.Product;

public interface Storage {

    void addProduct(Product[] products, Product product);

    void getProducts(Product[] products);

    void buyProducts(Product[] products, Product product);

    Product[] storageExpansion(Product[] products, int extensionValue);

    void deliveryProducts(Product[] storage, Product[] deliveryProducts);

}
