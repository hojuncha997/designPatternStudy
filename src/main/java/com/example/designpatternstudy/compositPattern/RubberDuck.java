package com.example.designpatternstudy.compositPattern;

public class RubberDuck implements QuackableInterfaceForCompositePattern{
    @Override
    public void quack(){
        System.out.println("삑삑");
    }
}
