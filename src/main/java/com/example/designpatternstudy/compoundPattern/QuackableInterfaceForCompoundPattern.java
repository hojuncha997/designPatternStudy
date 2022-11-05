//QuackableInterfaceForCompoundPattern.java

package com.example.designpatternstudy.compoundPattern;
//개별 객체(오리)를 감시하고 싶어서 이 인터페이스로하여금 Observable 클래스를 확장하도록 하였다.
public interface QuackableInterfaceForCompoundPattern extends QuackObservable {
    public void quack();
}
