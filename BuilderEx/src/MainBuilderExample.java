import model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainBuilderExample {
    public static void main(String[] args) {
// Обычный подход
//        User user = new User(
//                12,
//                "Dima",
//                "Toropov",
//                "example@mail.ru",
//                "",
//                18
//        );

        // Подход через Builder
        User newUser = User.builder().build();
        System.out.println(newUser);

        User newUser1 = User.builder().withFirstName("Dima").withLastName("Toropov").withAge(21).build();

        System.out.println(newUser1);


    }
}