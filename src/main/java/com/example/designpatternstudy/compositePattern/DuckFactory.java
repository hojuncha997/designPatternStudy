//DuckFactory.java
//데코레이터가 없는 오리 생성 팩토리
package com.example.designpatternstudy.compositePattern;

public class DuckFactory extends AbstractDuckFactory{ //추상 팩토리 확장
    //각 메소드는 QuackableInterfaceForCompositePattern 인터페이스 객체를 만든다.
    //시뮬레이터는 실제 어떤 제품이 만들어지는지 알 수 없다.
    //단순히 QuackableInterfaceForCompositePattern이 리턴된다는 것만 안다.

    @Override
    public QuackableInterfaceForCompositePattern createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public QuackableInterfaceForCompositePattern createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public QuackableInterfaceForCompositePattern createDuckCall() {
        return new DuckCall();
    }

    @Override
    public QuackableInterfaceForCompositePattern createRubberDuck() {
        return new RubberDuck();
    }
}
