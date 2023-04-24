package creational.factory_method;

public class NaverUserFactory extends UserFactory {
    @Override
    User createUser() {
        return new NaverUser();
    }
}
