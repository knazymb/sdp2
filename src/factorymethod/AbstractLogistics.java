package factorymethod;

public abstract class AbstractLogistics {

    public abstract Transport createTransport();

    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        transport.deliver(cargo, destination);
    }
}