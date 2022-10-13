package com.example.designpatternstudy.compositPattern;
//청둥오리
public class MallardDuck implements QuackableInterfaceForCompositePattern{

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}