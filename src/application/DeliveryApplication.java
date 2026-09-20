package application;

import abstractfactory.Button;
import abstractfactory.Checkbox;
import abstractfactory.GUIFactory;
import factorymethod.AbstractLogistics;

public class DeliveryApplication {

    private final GUIFactory guiFactory;
    private final AbstractLogistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, AbstractLogistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    public void run() {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();

        logistics.planDelivery(
                "laboratory equipment",
                "Aktau warehouse"
        );
    }
}