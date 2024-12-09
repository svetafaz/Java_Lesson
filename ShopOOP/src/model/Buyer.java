package model;

import main.Main;

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
            System.out.println("\n Возраст меньше 0 не допустим. Username: " + super.getUsername());
            return 1;
        } else return super.getAge();
    }

    @Override
    public String getPass() {
        Main.logger.log();
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\nAddress: " +this.getAddress();
    }

    public Order buyProduct(String cardNumber) {
        // TODO
        return new Order(this.address);
    }

    public String getAddress() {
        return address;
    }
}
