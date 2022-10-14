//QuackCountingDecorator.java
package com.example.designpatternstudy.compoundPattern;
//데코레이터. 어댑터와 마찬가지로 타겟 인터페이스 구현 필요
public class QuackCountingDecorator implements QuackableInterfaceForCompoundPattern {
    //감싸고자 하는 객체의 레퍼런스를 저장하는 인스턴스 변수 필요
    QuackableInterfaceForCompoundPattern duck;
    static int numberOfQuacks;

    //생성자: 생성자에서 감싸고 있는 타겟 인터페이스의 레퍼런스를 가져온다.
    public QuackCountingDecorator(QuackableInterfaceForCompoundPattern duck){
        this.duck = duck;
    }

    @Override
    public void quack() {//호출 시 내부의 객체에게 동작을 위임.
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }

}
