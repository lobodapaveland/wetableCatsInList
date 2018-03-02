package com.example.pavel.wetableinterface;

/**
 * Created by pavel on 3/2/2018.
 */

public class Dog implements Animal{

    public boolean wetCondition;
    public String dogName;

    Dog(String _dogNameame, boolean _condition) {
        wetCondition = _condition;
        dogName = _dogNameame;
    }
    @Override
    public boolean getCondition() {
        return wetCondition;
    }

    @Override
    public void wet() {
        wetCondition = true;
    }
}
