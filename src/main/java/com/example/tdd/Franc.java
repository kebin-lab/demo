package com.example.tdd;

public class Franc extends Money {
  public Franc(int amount, String currency) {
    super(amount, currency);
  }
  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }
}
