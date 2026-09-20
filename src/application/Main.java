package application;

import abstractfactory.GUIFactory;
import abstractfactory.MacOSFactory;
import abstractfactory.WindowsFactory;
import factorymethod.AbstractLogistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter delivery mode (ROAD or SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        System.out.print("enter ui platform (WINDOWS or MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();

        AbstractLogistics logistics;
        GUIFactory guiFactory;

        if (deliveryMode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("invalid delivery mode: " + deliveryMode);
            System.out.println("choose ROAD or SEA.");
            return;
        }

        if (platform.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("invalid ui platform: " + platform);
            System.out.println("choose WINDOWS or MACOS.");
            return;
        }

        System.out.println();
        System.out.println("delivery mode: " + deliveryMode);
        System.out.println("ui platform: " + platform);
        System.out.println();

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run();
    }
}