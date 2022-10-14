package com.example.designpatternstudy.compositePattern;

public class RubberDuck implements QuackableInterfaceForCompositePattern{
    @Override
    public void quack(){
        System.out.println("삑삑");
    }
}
