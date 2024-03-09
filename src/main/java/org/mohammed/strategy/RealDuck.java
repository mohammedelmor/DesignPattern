package org.mohammed.strategy;

public class RealDuck extends Duck {

    public RealDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }


}
