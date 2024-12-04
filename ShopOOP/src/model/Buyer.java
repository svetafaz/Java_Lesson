package model;

public class Buyer extends User {
    private String cardNumber;
    private String address;

    public Buyer(int id, String country, int age, String username, String address) {
        super(id, country, age, username);
        this.address = address;
    }

    @Override
    public int getAge() {
        if (super.getAge() < 0) {
            System.out.println("Возраст меньше 0 не допустим.");
            return 1;
        } else return super.getAge();
    }

    public Order buyProduct(String cardNumber) {
        return new Order(this.address);
    }



}
