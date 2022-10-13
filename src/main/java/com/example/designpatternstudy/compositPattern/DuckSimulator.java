package com.example.designpatternstudy.compositPattern;

public class DuckSimulator {
    public static void initDuckSimul(){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        QuackableInterfaceForCompositePattern mallardDuck = new MallardDuck();
        QuackableInterfaceForCompositePattern redheadDuck = new RedheadDuck();
        QuackableInterfaceForCompositePattern duckCall = new DuckCall();
        QuackableInterfaceForCompositePattern rubberDuck = new RubberDuck();

        System.out.println("\n오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

    }

    void simulate(QuackableInterfaceForCompositePattern duck){
        duck.quack();
    }


}
