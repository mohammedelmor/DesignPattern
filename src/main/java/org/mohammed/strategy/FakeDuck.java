package org.mohammed.strategy;

public class FakeDuck extends Duck {
    public FakeDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
}
