package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ElectricalServiceImpl extends UnicastRemoteObject implements ElectricalService {
    public ElectricalServiceImpl() throws RemoteException{
        super();
    }
    @Override
    public void turnOn(Electrical electrical) throws RemoteException{
        System.out.println("Включен прибор: " + electrical.getName());
    }
}
