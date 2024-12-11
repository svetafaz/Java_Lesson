package service.impl;

import model.Product;
import service.StorageNew;

public class StorageNewImpl extends StorageNew {
    @Override
    public void addProduct(Product[] products, Product product) {

    }

    @Override
    public void getProducts(Product[] products) {
        getAllProducts();
    }

    @Override
    public void buyProducts(Product[] products, Product product) {

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
