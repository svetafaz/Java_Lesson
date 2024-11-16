public class User {
    private int id;
    private String username;
    private int height;
    private int age;

    private double check;

    void grow(int age) {
        this.age+=age;
        this.height = this.age * age;
    }

    public User(int id, String username, int height, int age) {
        this.id = id;
        this.username = username;
        this.height = height;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public int getHeight() {
        return height;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setHeight(int height) {
//        if (height == 0 || height < 0) {
//            this.height = 1;
//        } else {
//            this.height = height;
//        }
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}

