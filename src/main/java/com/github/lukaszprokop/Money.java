package com.github.lukaszprokop;

abstract class Money {

    protected int amount;

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);
}
