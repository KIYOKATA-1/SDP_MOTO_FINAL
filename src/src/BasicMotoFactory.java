public class BasicMotoFactory implements MotorcycleFactory{
    @Override
    public Motorcycle createMoto(String brand, String model, String color, int maxSpeed) {
        String description = brand + " " + model + ", Color " + color + ", Max Speed" + maxSpeed;
        double price = 100000;
        return new BasicMoto(description, price);
    }
}
