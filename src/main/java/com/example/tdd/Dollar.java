package com.example.tdd;

/**
 * Hello world!
 *
 */
public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
