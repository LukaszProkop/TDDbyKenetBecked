package com.github.lukaszprokop;

class Franc extends Money {

    public Franc(int amuont) {
        this.amount = amuont;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
