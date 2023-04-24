package creational.factory_method;

public class KakaoUser implements User {
    @Override
    public void signUp() {
        System.out.println("From KAKAO");
    }
}
