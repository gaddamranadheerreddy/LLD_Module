package com.scalar.lldmodule.DesignPatterns.Factory.factory;

import com.scalar.lldmodule.DesignPatterns.Factory.Components.Button;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.Menu;

public interface UIComponentFactory {
    //All the factory Methods in this.
    Button createButton(); //Factory Method.
    Menu createMenu(); //factory Method.
}
