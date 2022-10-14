//DuckSimulator.java

package com.example.designpatternstudy.compositePattern;

public class DuckSimulator {

    public static void initDuckSimul(){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        //인터페이스를 새로 생성할 때마다 새로운 데코레이터로 감싼다.
        QuackableInterfaceForCompositePattern mallardDuck
                = new QuackCountingDecorator(new MallardDuck());

        QuackableInterfaceForCompositePattern redheadDuck
                = new QuackCountingDecorator(new RedheadDuck());

        QuackableInterfaceForCompositePattern duckCall
                = new QuackCountingDecorator(new DuckCall());

        QuackableInterfaceForCompositePattern rubberDuck
                = new QuackCountingDecorator(new RubberDuck());
        //GooseAdapter를 사용해서 오리가 됨
        QuackableInterfaceForCompositePattern gooseDuck = new GooseAdapter(new Goose());

        //GooseAdapter오리도 데코레이터 사용
        QuackableInterfaceForCompositePattern gooseDuckDeco
                = new QuackCountingDecorator(new GooseAdapter(new Goose()));



        System.out.println("\n오리 시뮬레이션 게임 (+ 데코레이터)");

        simulate(mallardDuck); //1
        simulate(redheadDuck); //2
        simulate(duckCall); //3
        simulate(rubberDuck); //4
        //거위 시뮬레이트트
       simulate(gooseDuck);
       simulate(gooseDuckDeco);//5

        System.out.println("오리가 소리 낸 횟수:" +
                QuackCountingDecorator.getQuacks() + " 번");

    }
    //데코레이터도 QuackableInterfaceForCompositePatter 인터페이스이다.
    void simulate(QuackableInterfaceForCompositePattern duck){
        duck.quack();
    }


}
