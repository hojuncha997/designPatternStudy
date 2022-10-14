package com.example.designpatternstudy;

import com.example.designpatternstudy.compositePattern.DuckSimulator;
import org.junit.jupiter.api.Test;

public class CompositePatternTests {


    @Test
    public void duckSimulTest(){

//        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.initDuckSimul();
// 이렇게 했더니 아래와 같은 경고 발생
//        Static member 'com.example.designpatternstudy.compositPattern.DuckSimulator.initDuckSimul()' accessed via instance reference
//        Inspection info: Reports references to static methods and fields via a class instance rather than the class itself.
//        Even though referring to static members via instance variables is allowed by The Java Language Specification, this makes the code confusing as the reader may think that the result of the method depends on the instance.
//                The quick-fix replaces the instance variable with the class name.
//        Example:
//        String s1 = s.valueOf(0);
//        After the quick-fix is applied:
//        String s = String.valueOf(0);
//        클래스의 인스턴스를 통해 static 멤버(여기서는 initDuciSimul())에 접근하는 것도 가능하다. 그러나 이는 코드를 헷갈리게 만든다.
//        독자는 해당 메소드의 결과가 객체에 의존적이라고 생각할 수도 있다.
//        ==> 해당 멤버가 static이라면 객체 생성하여 접근할 필요 없이 그냥 클래스로 접근하라는 뜻.

        DuckSimulator.initDuckSimul();
        // 오리 시뮬레이션 게임
        //꽥꽥
        //결과
        //꽥꽥
        //꽉꽉
        //삑삑

        //오리 시뮬레이션 게임 (+ 거위 어댑터)
        //꽥꽥
        //꽥꽥
        //꽉꽉
        //삑삑
        //끽끽


    }

}
