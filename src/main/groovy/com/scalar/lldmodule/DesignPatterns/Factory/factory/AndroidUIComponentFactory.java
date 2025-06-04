package com.scalar.lldmodule.DesignPatterns.Factory.factory;

import com.scalar.lldmodule.DesignPatterns.Factory.Components.AndroidButton;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.AndroidMenu;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.Button;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
