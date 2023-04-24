package creational.factory_method;

public abstract class UserFactory {
    public User newInstance() {
        User user = createUser();
        user.signUp();
        return user;
    }

    abstract User createUser();
}
