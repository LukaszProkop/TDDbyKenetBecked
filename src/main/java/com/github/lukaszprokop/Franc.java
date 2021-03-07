package com.github.lukaszprokop;

public class Franc {
    private int amount;

    public Franc(int amuont) {
        this.amount = amuont;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
