package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ElectricalService extends Remote {
    void turnOn(Electrical electrical) throws RemoteException;
}
