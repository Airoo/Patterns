package ru.javago.structural.bridge.source.drawers;

public class LargeCircleDrawer implements Drawer {
    private static final double RADIUS_MULTIPLIER = 10d;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*RADIUS_MULTIPLIER);
    }
}
