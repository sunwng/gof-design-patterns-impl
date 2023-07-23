package behavioral.interpreter;

public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws Exception {
        name = context.currentToken();
        if (name == null) {
            throw new Exception("Error: Missing <primitive command>");
        } else if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new Exception("Error: Unknown <primitive command>: '" + name + "'");
        }
        context.skipToken(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
