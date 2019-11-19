public class VehicleBuilder {

    private String type;
    private String license;
    private String color;
    private int wheel;

    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public VehicleBuilder setLicense(String license) {
        this.license = license;
        return this;
    }

    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder setWheel(int wheel) {
        this.wheel = wheel;
        return this;
    }

    public Vehicle builder(){
        return new Vehicle(type,license,color,wheel);
    }
}
