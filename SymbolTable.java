// https://stackoverflow.com/questions/66205524/what-kind-of-data-structure-should-i-provide-to-handle-scopes-in-my-compiler

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {

    private final Map<String, String> stack;
    private final Stack<String> undoStack;

    public SymbolTable() {
        stack = new HashMap<>();
        undoStack = new Stack<>();
    }

    public void put(String id, String type) {
        if (id.equals("#")) {
            deleteStack();
        } else {
            stack.put(id, type);
            undoStack.push(id);
        }
    }

    public String pop() {
        return undoStack.pop();
    }

    public String get(String id) {
        return stack.get(id);
    }

    public void set(String id, String type) {
        stack.replace(id, type);
    }

    public boolean contains(String id) {
        return stack.containsKey(id);
    }

    private void deleteStack() throws EmptyStackException {
        String head;
        do {
            head = undoStack.pop();
            stack.remove(head);
            if (undoStack.isEmpty())
                return;
        } while (!head.equals("##"));
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "\nst=" + stack +
                "\nundoStack=" + undoStack +
                "}\n";
    }
}