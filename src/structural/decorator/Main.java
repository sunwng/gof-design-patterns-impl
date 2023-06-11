package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        System.out.println("b1 start");
        b1.show();
        System.out.println("b1 end");
        System.out.println("b2 start");
        b2.show();
        System.out.println("b2 end");
        System.out.println("b3 start");
        b3.show();
        System.out.println("b3 end");
        System.out.println("b4 start");
        Display b4 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(
                        new FullBorder(
                            new StringDisplay("what is it!")
                        ), '*'
                    )
                )
            ), '/'
        );
        b4.show();
        System.out.println("b4 end");
    }

}
