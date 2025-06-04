package com.scalar.lldmodule.DesignPatterns.Factory.factory;

import com.scalar.lldmodule.DesignPatterns.Factory.Components.Button;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.IOSButton;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.IOSMenu;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
