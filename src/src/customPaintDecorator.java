public class customPaintDecorator extends CustomDecorator{
    public customPaintDecorator(Motorcycle decoratedMoto) {
        super(decoratedMoto);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", custom Paint";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5000.0;
    }
}
