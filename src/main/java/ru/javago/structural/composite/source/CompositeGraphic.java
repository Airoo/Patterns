package ru.javago.structural.composite.source;

import ru.javago.structural.composite.source.graphics.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic childGraphic : childGraphics) {
            childGraphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
