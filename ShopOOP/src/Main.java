import model.Product;
import model.Storage;
import model.AddStorage;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет магазин!");
        Storage storage = new Storage();
        AddStorage addStorage = new AddStorage();

        Product[] productsOne = new Product[3];
        Product[] productsOne = new  Product [3++];
        System.out.println(Arrays.toString(productsOne));

        productsOne[0] = new Product("table", 0, 5);
        productsOne[1] = new Product("chair", 1, 10);
        productsOne[2] = new Product("bookshelf", 2, 3);

        Product[] productsTwo = {
                new Product("table", 0, 5),
                new Product("chair", 1, 10),
                new Product("bookshelf", 2, 3)
        };

        //TODO: Product[] newStorаge = storage.addNewStorage();

        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);

        Product[] productsThree = new Product[3];
        storage.addProducts(productsThree, table);
        storage.addProducts(productsThree, chair);
        storage.addProducts(productsThree, bookshelf);
        System.out.println(Arrays.toString(productsOne));
        System.out.println(Arrays.toString(productsTwo));
        System.out.println(Arrays.toString(productsThree));

        storage.getProducts(productsThree);
        storage.buyProducts(productsThree, table);

        // TODO: подумать над реализацией static методов

    }

}