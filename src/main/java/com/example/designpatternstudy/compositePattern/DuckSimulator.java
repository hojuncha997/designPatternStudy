package com.example.designpatternstudy.compositePattern;

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
        //GooseAdapter를 사용해서 오리가 됨
        QuackableInterfaceForCompositePattern gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임 (+ 거위 어댑터)");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        //거위 시뮬레이트트
       simulate(gooseDuck);

    }

    void simulate(QuackableInterfaceForCompositePattern duck){
        duck.quack();
    }


}
