public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height =1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getTheTich() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
