package creational.factory_method;

public class NaverUser implements User {
    @Override
    public void signUp() {
        System.out.println("From NAVER");
    }
}
