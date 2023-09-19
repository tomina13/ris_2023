package org.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try {
            ElectricalService service = new ElectricalServiceImpl();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("ElectricalService", service);

            System.out.println("Сервер готов к приему вызовов.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
