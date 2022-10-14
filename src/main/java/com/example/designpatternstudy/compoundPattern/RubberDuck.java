package com.example.designpatternstudy.compoundPattern;

public class RubberDuck implements QuackableInterfaceForCompoundPattern {
    @Override
    public void quack(){
        System.out.println("삑삑");
    }
}
