//Subject.java

package com.example.designpatternstudy.observerPattern;

public interface Subject {
    public void registerObserver(ObserverForObserverPattern observer);
    public void removeObserver(ObserverForObserverPattern observer);

    //주제의 상태가 변경되었을 때 모든 옵저버에게 변경내용을 알리기 위해 호출되는 메소드
    public void notifyObservers();
}