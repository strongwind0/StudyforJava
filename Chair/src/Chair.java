public class Chair {

    private Cylinder top;
    private Cylinder middle;
    private Cylinder bottom;

    public Chair() {
        top = new Cylinder();
        middle = new Cylinder();
        bottom = new Cylinder();
    }

    public Chair(double topHeight, double topRadius,
                 double middleHeight, double middleRadius,
                 double bottomHeight, double bottomRadius) {
        top.setHeight(topHeight);
        top.setRadius(topRadius);
        middle.setHeight(middleHeight);
        middle.setRadius(middleRadius);
        bottom.setHeight(bottomHeight);
        bottom.setRadius(bottomRadius);
    }

    public void setTop(double topHeight, double topRadius) {
        top.setHeight(topHeight);
        top.setRadius(topRadius);
    }

    public void setMiddle(double middleHeight, double middleRadius) {
        middle.setHeight(middleHeight);
        middle.setRadius(middleRadius);
    }

    public void setBottom(double bottomHeight, double bottomRadius) {
        bottom.setHeight(bottomHeight);
        bottom.setRadius(bottomRadius);
    }

    public Cylinder getTop() {
        return this.top;
    }

    public Cylinder getMiddle() {
        return this.middle;
    }

    public Cylinder getBottom() {
        return this.bottom;
    }

    public double getArea() {
        return top.getArea() + middle.getArea() + bottom.getArea()
                - 4 * middle.getBottomArea();
    }

    public double getVolume() {
        return top.getVolume() + middle.getVolume() + bottom.getVolume();
    }
}
