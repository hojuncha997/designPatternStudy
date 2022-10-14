package com.example.designpatternstudy.compoundPattern;
// 거위 추가하기.
public class Goose {
    public void honk(){
        System.out.println("끽끽");
    }
    //시뮬레이터를 사용하기 위해서는 QuackableInterfaceForCompoundPattern를 써야함.
    //그러나 거위는 quack() 대신 honk()를 가지고 있음.
    //따라서 오리 자리에 거위가 들어가 수 있도록 adapter를 사용하자. GooseAdapter.java

}
