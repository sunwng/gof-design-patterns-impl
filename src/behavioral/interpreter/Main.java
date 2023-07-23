package behavioral.interpreter;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            for (String text : Files.readAllLines(Path.of("/Users/wng/git_ws/gof-design-patterns-impl/src/behavioral/interpreter/program.txt"))) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
