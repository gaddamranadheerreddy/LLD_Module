package com.scalar.lldmodule.DesignPatterns.Factory.Components;

public class IOSMenu implements Menu{
    @Override
    public void checkMenu() {
        System.out.println("IOS Menu");
    }
}
