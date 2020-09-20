package model;

import java.util.List;

public class Budget {

    private double value;
    private List<Item> items;

    public Budget(double value){

        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
