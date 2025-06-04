package com.scalar.lldmodule.DesignPatterns.Factory.factory;

public class AndroidUIComponent implements UIComponent {
    @Override
    public void refreshUI() {
        System.out.println("Android refreshUI");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
