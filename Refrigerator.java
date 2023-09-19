package org.example;

public class Refrigerator extends Electrical {
    private boolean freezer;

    public Refrigerator(String name, double power, boolean hasFreezer){
        super(name, power);
        this.freezer = hasFreezer;
    }
    public boolean hasFreezer(){
        return freezer;
    }
    @Override
    public String tostring(){
        return "Refrigerator{"+"name='"+getName()+'\''+", power="+getPower()+", freezer="+freezer+'}';
    }
}
