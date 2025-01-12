package service;

import enums.EnumStatusCode;
import model.Product;

public interface Storage {

    void addProduct(Product[] products, Product product);

    void getAllProducts(Product[] products);

    EnumStatusCode buyProducts(Product[] products, Product product);

    Product[] storageExpansion(Product[] products, int extensionValue);

    void deliveryProducts(Product[] storage, Product[] deliveryProducts);

}
