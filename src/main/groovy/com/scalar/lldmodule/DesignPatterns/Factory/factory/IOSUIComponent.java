package com.scalar.lldmodule.DesignPatterns.Factory.factory;

public class IOSUIComponent implements UIComponent{
    @Override
    public void refreshUI() {
        System.out.println("IOS refreshUI");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
