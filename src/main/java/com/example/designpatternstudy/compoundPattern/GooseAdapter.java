package com.example.designpatternstudy.compoundPattern;
//Goose를 DuckSimulator를 사용해 시뮬레이션 하기 위해 사용하는 어댑터

//어댑터 클래스에서는 타겟 인터페이스를 구현해야 한다.
// 여기서는 QuackableInterfaceForCompoundPattern이 타겟
public class GooseAdapter implements QuackableInterfaceForCompoundPattern {

    Goose goose;

    //생성자
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}