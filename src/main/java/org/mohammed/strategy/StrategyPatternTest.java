package org.mohammed.strategy;

import java.util.List;

public class StrategyPatternTest {

    public static void main(String[] args) {

        FlyBehavior flyBehavior1 = new FlyWithWings();
        FlyBehavior flyBehavior2 = new FlyNoWay();

        QuackBehavior quackBehavior1 = new Quack();
        QuackBehavior quackBehavior2 = new MuteQuack();

        Duck realDuck = new RealDuck(flyBehavior1, quackBehavior1);
        Duck fakeDuck1 = new FakeDuck(flyBehavior2, quackBehavior2);
        Duck fakeDuck2 = new FakeDuck(() -> System.out.println("Fly with fake wings"), () -> System.out.println("Zew!!!"));
        List<Duck> ducks = List.of(realDuck, fakeDuck1, fakeDuck2);
        ducks.forEach(duck -> {
            duck.performFly();
            duck.performQuack();
        });
    }

}
