package com.scalar.lldmodule.DesignPatterns.Factory.Components;

public class IOSButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Click IOS button");
    }
}
