package ru.javago.structural.bridge.source.drawers;

public class SmallCircleDrawer implements Drawer{
    private static final double RADIUS_MULTIPLIER = 0.25d;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*RADIUS_MULTIPLIER);
    }
}
