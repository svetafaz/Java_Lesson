public class Main {
    public static void main(String[] args) {

        User user1 = new User(
                1,
                "Виталя",
                45,
                5
        );
        User user2 = new User(
                2,
                "Екатерина",
                64,
                8
                );
        FuncPrint system = new FuncPrint();

        system.print("Hello world!");

        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());

        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());


        user1.grow(2);
        user2.grow(5);

        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());



        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());
    }

}