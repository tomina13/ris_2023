package org.example;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Electrical washingMachine = new Electrical("Bosch", 1500) {
            @Override
            public String tostring() {
                return null;
            }
        };
        Electrical refrigerator = new Electrical("LG", 200) {
            @Override
            public String tostring() {
                return null;
            }
        };

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("electrical.ser"))){
            outputStream.writeObject(washingMachine);
            outputStream.writeObject(refrigerator);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("electrical.ser"))){
            Electrical deserializedWashingMachine = (Electrical) inputStream.readObject();
            Electrical deserializedRefrigerator = (Electrical) inputStream.readObject();

            System.out.println("Десериализованный стиральная машина: " + deserializedWashingMachine);
            System.out.println("Десериализованный холодильник: " + deserializedRefrigerator);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
