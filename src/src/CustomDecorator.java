abstract class CustomDecorator implements Motorcycle{
    protected Motorcycle decoratedMoto;

    public CustomDecorator(Motorcycle decoratedMoto){
        this.decoratedMoto = decoratedMoto;
    }

    @Override
    public String getDescription(){
        return decoratedMoto.getDescription();
    }

    @Override
    public double getPrice(){
        return  decoratedMoto.getPrice();
    }
}
