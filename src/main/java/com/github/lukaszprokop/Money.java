package com.github.lukaszprokop;

class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    Expression plus(Money added) {
        return new Money(amount + added.amount, currency);
    }
}
