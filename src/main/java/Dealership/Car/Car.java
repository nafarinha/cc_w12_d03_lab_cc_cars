package Dealership.Car;

public abstract class Car
{
    private String make;
    private String model;
    private String colour;

    public Car(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this. colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
