package model;

public class Storage {

    // TODO: реализовать во всех методах проверку того, что position не превышает размерности массива
    // TODO: написать try()...catch(), чтобы программа продолжала работу

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

    //TODO:
    // addNewStorage()
    // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)

    // TODO:
    //  deliveryProducts()
    //  реализовать пополнение товаров на складе.


}
