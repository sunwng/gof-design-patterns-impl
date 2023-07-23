package behavioral.interpreter;


public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws Exception {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
