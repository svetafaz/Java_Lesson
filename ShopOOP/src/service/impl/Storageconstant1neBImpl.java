package service.impl;

import main.Main;
import model.Product;
import service.Storage;

public class Storageconstant1neBImpl implements Storage {
    @Override
    public void addProduct(Product[] products, Product product) {
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона!");
            }
            products[position] = product;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage() + " в addProduct");
        }
    }

    @Override
    public void getAllProducts(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
            }
        }
    }

    @Override
    public int buyProducts(Product[] products, Product product) {
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length || products[position] == null || products[position].getName().equals(product.getName())) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона или продукт отсутствует!");
            }
            if (products[position].getCount() - product.getCount() < 0 || product.getCount() <= 0) {
                return Main.PRODUCT_IS_OUT_OF_STOCK;
            } else {
                for (int i = 1; i <= product.getCount(); i++) {
                    products[position].removeOne();
                }
                return Main.SUCCESSFULLY;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage() + " в buyProduct");
            return Main.ERROR;
        }

    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        Product[] newStorage = new Product[products.length * extensionValue];
        System.arraycopy(products, 0, newStorage, 0, products.length);
        return newStorage;
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {
        Product product = deliveryProducts[0];
        int position = product.getPosition();
        if (position < 0) {
            System.err.println("Position не может быть отрицательным");
            return;
        }
        if (product.getPosition() >= storage.length) {
            storage = storageExpansion(storage, 2);
        }
        addProduct(storage, product);
    }
}
