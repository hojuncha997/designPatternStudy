//Observable.java

package com.example.designpatternstudy.compoundPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Observable implements QuackObservable{

    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
//        Iterator iterator = observers.iterator();
//        위 코드대로 하면 경고 발생 : Raw use of parameterized class 'Iterator'
        Iterator<Observer> iterator = observers.iterator();

        while (iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
