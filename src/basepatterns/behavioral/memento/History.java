package basepatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorMemento> states = new ArrayList<>();

    public void push(EditorMemento memento) {
        states.add(memento);
    }

    public EditorMemento pop() {
        int lastIndex = states.size() - 1;
        EditorMemento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
