package com.scalar.lldmodule.DesignPatterns.Factory.factory;

public interface UIComponent {
    void refreshUI(); //Non-factory method.

    //To establish connection between DB, and DBFactory
    //Establishing connection between UIComponent and UIComponentFactory
    UIComponentFactory createUIComponentFactory(); //Factory Method.
}
