package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    @Override
    public void draw() {
        for (Component component : components) {
            component.draw();
        }
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }
}
