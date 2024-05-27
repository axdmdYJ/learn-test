package cn.tjut.design_patten.composit;

import java.util.List;

public abstract class Component {
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void operation(List<Component> componentList);

    public abstract Component getChild(int i);
}
