//DuckSimulator.java

package com.example.designpatternstudy.compositePattern;

public class DuckSimulator {

    public static void initDuckSimul(){
        DuckSimulator simulator = new DuckSimulator();
        //simulate()메서드에 전달할 팩토리 생성(데코레이터 사용)
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        //파라미터 추가
        simulator.simulate(duckFactory);
    }

    //파라미터 추가
    void simulate(AbstractDuckFactory duckFactory){
        //인터페이스를 새로 생성할 때마다 새로운 데코레이터로 감싼다.
        //객체의 인터페이스를 직접 생성하지 않고 팩토리 메소드로 생성한다.

        QuackableInterfaceForCompositePattern mallardDuck
                = duckFactory.createMallardDuck();

        QuackableInterfaceForCompositePattern redheadDuck
                = duckFactory.createRedheadDuck();

        QuackableInterfaceForCompositePattern duckCall
                = duckFactory.createDuckCall();

        QuackableInterfaceForCompositePattern rubberDuck
                = duckFactory.createRubberDuck();

        //GooseAdapter를 사용해서 오리가 됨
        QuackableInterfaceForCompositePattern gooseDuck = new GooseAdapter(new Goose());

        //GooseAdapter오리도 데코레이터 사용
//        QuackableInterfaceForCompositePattern gooseDuckDeco
//                = new QuackCountingDecorator(new GooseAdapter(new Goose()));



        System.out.println("\n오리 시뮬레이션 게임 (+ 추상 팩토리리)");

       simulate(mallardDuck); //1
        simulate(redheadDuck); //2
        simulate(duckCall); //3
        simulate(rubberDuck); //4
        //거위 시뮬레이트트
       simulate(gooseDuck);
//       simulate(gooseDuckDeco);//5

        System.out.println("오리가 소리 낸 횟수:" +
                QuackCountingDecorator.getQuacks() + " 번");

    }
    //데코레이터도 QuackableInterfaceForCompositePatter 인터페이스이다.
    void simulate(QuackableInterfaceForCompositePattern duck){
        duck.quack();
    }


}
