public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private String color;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public void setTollFee(double newValue) {
        tollFee = newValue;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int newValue) {
        passengers = newValue;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public void printInfo() {
        System.out.println("License plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void color() {
        color = "black";
    }
}
