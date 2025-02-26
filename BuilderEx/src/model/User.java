package model;

public class User {
    public final int id;
    public final String firstName;
    public final String lastName;
    public final String email;
    public final String phone;
    public final int age;

    private User(int id, String firstName, String lastName, String email, String phone, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User:" + id + " " + firstName + " " + lastName + " " + email + " " + phone + " " + age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private int age;

        private Builder() { }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(id,
                    firstName,
                    lastName,
                    email,
                    phone,
                    age);
        }
    }


}


