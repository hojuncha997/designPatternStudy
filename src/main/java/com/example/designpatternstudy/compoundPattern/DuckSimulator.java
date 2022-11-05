//DuckSimulator.java

package com.example.designpatternstudy.compoundPattern;

public class DuckSimulator {

    public static void initDuckSimul(){
        DuckSimulator simulator = new DuckSimulator();
        //simulate()메서드에 전달할 팩토리 생성(데코레이터 사용)
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        //파라미터 추가
        simulator.simulateAll(duckFactory);
    }

    //파라미터 추가
    void simulateAll(AbstractDuckFactory duckFactory){
        QuackableInterfaceForCompoundPattern redheadDuck = duckFactory.createRedheadDuck();
        QuackableInterfaceForCompoundPattern duckCall = duckFactory.createDuckCall();
        QuackableInterfaceForCompoundPattern rubberDuck = duckFactory.createRubberDuck();
        QuackableInterfaceForCompoundPattern gooseDuck = new GooseAdapter(new Goose());


//        System.out.println("\n오리 시뮬레이션 게임: 무리 (+ 컴포지트)");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);


        //물오리만 들어가는 Flock객체(Composite객체) 생성
        Flock flockOfMallards = new Flock();

        //개별 물오리(mallard) 생성
        QuackableInterfaceForCompoundPattern mallardOne = duckFactory.createMallardDuck();
        QuackableInterfaceForCompoundPattern mallardTwo = duckFactory.createMallardDuck();
        QuackableInterfaceForCompoundPattern mallardThree = duckFactory.createMallardDuck();
        QuackableInterfaceForCompoundPattern mallardFour = duckFactory.createMallardDuck();

        //개별 물오리를 컴포지트 객체에 추가하기
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        //물오리 무리(flockOfMallards)를 아까 만든 오리 무리(flockOfDucks)에 넣는다.
        flockOfDucks.add(flockOfMallards);

//        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
//        simulate(flockOfDucks);
//
//        System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
//        simulate(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 (+옵저버))");
        Quackologist quackologist = new Quackologist();

        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);


        System.out.println("오리가 소리 낸 횟수:" +
                QuackCountingDecorator.getQuacks() + " 번");

    }
    //데코레이터도 QuackableInterfaceForCompoundPatter 인터페이스이다.
    void simulate(QuackableInterfaceForCompoundPattern duck){
        duck.quack();
    }


}
//
//오리 시뮬레이션 게임: 무리 (+ 컴포지트)
//
//오리 시뮬레이션 게임: 전체 무리
//꽥꽥
//꽉꽉
//삑삑
//끽끽
//꽥꽥
//꽥꽥
//꽥꽥
//꽥꽥
//
//오리 시뮬레이션 게임: 물오리 무리
//꽥꽥
//꽥꽥
//꽥꽥
//꽥꽥
//오리가 소리 낸 횟수:11 번