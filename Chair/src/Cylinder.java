public class Cylinder {

    private double height;

    private double radius;

    public Cylinder() {
        this.height = 0;
        this.radius = 0;
    }

    public Cylinder(double Height, double Radius) {
        this.height = Height;
        this.radius = Radius;
    }

    public void setHeight(double Height) {
        this.height = Height;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.getSideArea() + 2 * this.getBottomArea();
    }

    public double getSideArea() {
        return 2 * this.radius * Math.PI * this.height;
    }

    public double getBottomArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getVolume() {
        return this.getBottomArea() * this.height;
    }
}