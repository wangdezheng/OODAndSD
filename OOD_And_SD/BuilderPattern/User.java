package BuilderPattern;

/**
 * Why we use builder patterns:
 * 1: Too many constructors (need many constructors for possible attribute combinations)
 * 2. Very hard to use with a long parameter list
 *
 * What if we use setter to initialize ?
 * Limitation:
 * Need multiple call to finish object creation, we can't semantically ensure when a user object will be created .
 */
public class User {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;
    private String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
