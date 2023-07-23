package behavioral.interpreter;

public class RepeatCommandNode extends Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws Exception {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
