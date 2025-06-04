package com.scalar.lldmodule.DesignPatterns.Factory.Components;

public class AndroidButton implements Button{

    @Override
    public void clickButton() {
        System.out.println("Click Android Button");
    }
}
