package cn.tjut.design_patten.composit;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void operation(List<Component> componentList) {
        componentList.forEach(component -> System.out.println(component.toString()));
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }
}
