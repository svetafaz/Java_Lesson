package service.impl;

import model.Product;
import service.Storage;

public class StorageImpl implements Storage {
    @Override
    public void addProduct(Product[] products, Product product) {
        products[product.getPosition()] = product;
    }

    @Override
    public void getProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    @Override
    public void buyProducts(Product[] products, Product product) {
        products[product.getPosition()].removeOne();
    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        return new Product[products.length + extensionValue];
        //TODO:
        // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)

    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {
        // TODO:
        //  реализовать пополнение товаров на складе от поставщика.
    }
}
