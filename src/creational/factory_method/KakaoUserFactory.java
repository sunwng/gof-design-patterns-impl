package creational.factory_method;

public class KakaoUserFactory extends UserFactory {
    @Override
    User createUser() {
        return new KakaoUser();
    }
}
