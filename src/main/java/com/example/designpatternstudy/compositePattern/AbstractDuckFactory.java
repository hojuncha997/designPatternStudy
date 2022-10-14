//AbstractDuckFactory.java
//새로운 기능을 사용할 때는 객체를 데코레이터로 감싸야만 가능
//이 감싸는 작업을 따로 빼내어 한 군데서 하기 위해 팩토리 사용
package com.example.designpatternstudy.compositePattern;
//추상 클래스
public abstract class AbstractDuckFactory {
    //추상 메서드
    public abstract QuackableInterfaceForCompositePattern createMallardDuck();
    public abstract QuackableInterfaceForCompositePattern createRedheadDuck();
    public abstract QuackableInterfaceForCompositePattern createDuckCall();
    public abstract QuackableInterfaceForCompositePattern createRubberDuck();

}
