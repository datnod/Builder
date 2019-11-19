public class Vehicle {
    private String type;
    private String license;
    private String color;
    private int wheel;

    @Override
    public String toString() {
        return "Type of vehicle: " + type  +
                ", with license plate: " + license +
                ", color is: " + color  +
                ", number of wheels: " + wheel;
    }

    public Vehicle(String type, String license, String color, int wheel) {
        this.type = type;
        this.license = license;
        this.color = color;
        this.wheel = wheel;
    }
}
