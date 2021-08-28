package com.training.app;

public abstract class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amout) {
        return new Dollar(amout);
    }

    static Money franc(int amout) {
        return new Franc(amout);
    }

    public abstract Money times(int multiplier);
}
