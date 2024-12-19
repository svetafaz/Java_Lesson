package service;

import model.Product;

public interface Storage {

    void addProduct(Product[] products, Product product);

    void getAllProducts(Product[] products);

    int buyProducts(Product[] products, Product product);

    Product[] storageExpansion(Product[] products, int extensionValue);

    void deliveryProducts(Product[] storage, Product[] deliveryProducts);

}
