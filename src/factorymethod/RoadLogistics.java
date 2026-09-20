package factorymethod;

public class RoadLogistics extends AbstractLogistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}