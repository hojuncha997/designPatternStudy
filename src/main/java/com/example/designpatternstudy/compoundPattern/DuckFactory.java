//DuckFactory.java
//데코레이터가 없는 오리 생성 팩토리
package com.example.designpatternstudy.compoundPattern;

public class DuckFactory extends AbstractDuckFactory{ //추상 팩토리 확장
    //각 메소드는 QuackableInterfaceForCompoundPattern 인터페이스 객체를 만든다.
    //시뮬레이터는 실제 어떤 제품이 만들어지는지 알 수 없다.
    //단순히 QuackableInterfaceForCompoundPattern이 리턴된다는 것만 안다.

    @Override
    public QuackableInterfaceForCompoundPattern createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public QuackableInterfaceForCompoundPattern createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public QuackableInterfaceForCompoundPattern createDuckCall() {
        return new DuckCall();
    }

    @Override
    public QuackableInterfaceForCompoundPattern createRubberDuck() {
        return new RubberDuck();
    }
}
