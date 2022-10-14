package com.example.designpatternstudy.compositePattern;

public class DuckCall implements QuackableInterfaceForCompositePattern{
    @Override
    public void quack(){
        System.out.println("꽉꽉");
    }
}
