package service.impl;

import main.Main;
import model.Product;
import service.Storage;

public class StorageANewcomertoImpl implements Storage {
    @Override
    public void addProduct(Product[] products, Product product) {
        products[product.getPosition()] = product;
    }

    @Override
    public void getAllProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    @Override
    public int buyProducts(Product[] products, Product product) {
        if (product.getCount() <= 0) {
            return Main.PRODUCT_IS_OUT_OF_STOCK;
        } else {
            for (int i = 1; i <= product.getCount(); i++) {
                products[product.getPosition()].removeOne();
            }
            return Main.SUCCESSFULLY;
        }
    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        // вычисляем длинну массива
        int oldLength = products.length;
        // создаем новый массив прибавляя к старому 10
        Product[] productsNew = new Product[oldLength + extensionValue];
        // переносим старые значения в новый массив
        System.arraycopy(products, 0, productsNew, 0, oldLength);
        // заменяем старый массив новым
        return productsNew;
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {

    }
}
