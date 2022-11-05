//Flock.java
//오리 무리를 만드는 클래스
//composite패턴 사용: 객체들로 구성된 컬렉션을 개별 객체와 같은 방식으로 다룰 수 있게 해준다.
package com.example.designpatternstudy.compoundPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//복합객체와 잎 원소에서 같은 인터페이스를 구현해야 한다.
//여기서는 QuackableInterfaceForCompoundPattern이 잎 원소가 된다.
public class Flock implements QuackableInterfaceForCompoundPattern {

    List<QuackableInterfaceForCompoundPattern> quackers
            = new ArrayList<QuackableInterfaceForCompoundPattern>();

    //Flock에 QuackableInterfaceForCompoundPattern(오리)을 추가하는 메서드
    public void add(QuackableInterfaceForCompoundPattern quacker){
        //List에 새로운 QuackableInterfaceForCompoundPattern(오리)추가
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        //반복자(Iterator)패턴 사용
        //오리 리스트(quackers)를 이터레이터로 만든다.
        Iterator<QuackableInterfaceForCompoundPattern> iterator
                = quackers.iterator();

        while (iterator.hasNext()) {
            //이터레이터에 남은 원소가 없을 때까지 반복한다.
            QuackableInterfaceForCompoundPattern quacker = iterator.next();
            quacker.quack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<QuackableInterfaceForCompoundPattern> iterator
                = quackers.iterator();
        while(iterator.hasNext()){
            QuackableInterfaceForCompoundPattern quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
