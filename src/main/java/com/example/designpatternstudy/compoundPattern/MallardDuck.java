package com.example.designpatternstudy.compoundPattern;
//청둥오리
public class MallardDuck implements QuackableInterfaceForCompoundPattern {

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
