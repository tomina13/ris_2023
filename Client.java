package org.example;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args){
        try{
            ElectricalService service =(ElectricalService) Naming.lookup("rmi://localhost/ElectricalService");
            Electrical refrigerator = new Electrical("Холодильник", 150) {
                @Override
                public String tostring() {
                    return null;
                }
            };
            service.turnOn(refrigerator);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
