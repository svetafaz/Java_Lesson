package service.impl;

import model.Product;
import service.StorageNew;

public class StorageNewImpl implements StorageNew {
    @Override
    public void addProduct(Product[] products, Product product) {

    }

    @Override
    public void getAllProducts(Product[] products) {
        getAllProducts();
    }

    @Override
    public int buyProducts(Product[] products, Product product) {
        return 1;
    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        return new Product[0];
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {

    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void log() {

    }
}
