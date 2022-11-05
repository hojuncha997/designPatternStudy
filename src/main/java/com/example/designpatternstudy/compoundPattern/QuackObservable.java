//QuackObservable.java

package com.example.designpatternstudy.compoundPattern;

//개별 객체의 동작을 감시하고자 할 때 사용
//여기서는 QuackableInterfaceForCompoundPattern을 의미한다.
public interface QuackObservable {

    //옵저버를 등록하는 메소드
    //Observer 인터페이스를 구현하는 객체라면 어떤 객체든 꽥꽥 소리 내는 걸 감시할 수 있다.
    //여기서는 QuackableInterfaceForCompoundPattern에서 구현한다.
    public void registerObserver(Observer observer);

    //옵저버에 연락을 돌리는 메소드
    public void notifyObservers();
}
