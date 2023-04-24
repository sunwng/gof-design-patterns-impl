package creational.singleton;

public class SingletonSample {
    private static SingletonSample singletonSample = new SingletonSample();
    private SingletonSample() {

    }

    public static SingletonSample getInstance() {
        return singletonSample;
    }
}
