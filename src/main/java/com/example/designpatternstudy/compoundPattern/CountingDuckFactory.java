package com.example.designpatternstudy.compoundPattern;

public class CountingDuckFactory extends AbstractDuckFactory{

    //모든 메서드에서 QuackableInterfaceForCompoundPattern객체를
    //QuackCountingDecorator데코레이터로 감싼다.
    //시뮬레이터는 데코레이터로 감싼 객체가 반환된다는 것을 알 수 없다.
    //이전과 똑같이 QuackableInterfaceForCompoundPattern를 반환받았다고 여긴다.

    @Override
    public QuackableInterfaceForCompoundPattern createMallardDuck() {
        return new QuackCountingDecorator(new MallardDuck());
    }

    @Override
    public QuackableInterfaceForCompoundPattern createRedheadDuck() {
        return new QuackCountingDecorator(new RedheadDuck());
    }

    @Override
    public QuackableInterfaceForCompoundPattern createDuckCall() {
        return new QuackCountingDecorator(new DuckCall());
    }

    @Override
    public QuackableInterfaceForCompoundPattern createRubberDuck() {
        return new QuackCountingDecorator(new RubberDuck());
    }
}
