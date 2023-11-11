public class BasicMoto implements Motorcycle{
    private String desc;
    private double price;

    public BasicMoto(String Description, double Price){
        this.desc = Description;
        this.price = Price;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
