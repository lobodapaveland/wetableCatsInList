package com.example.pavel.wetableinterface;

/**
 * Created by pavel on 3/2/2018.
 */

public class Cat implements Animal {

    public String name;
    public boolean wetCondition = false;

    Cat(String _name, boolean _wetCondition){
        name = _name;
        wetCondition = _wetCondition;
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
