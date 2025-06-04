package com.scalar.lldmodule.DesignPatterns.Factory;

import com.scalar.lldmodule.DesignPatterns.Factory.factory.AndroidUIComponent;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.IOSUIComponent;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.UIComponent;

public class UIComponentHelper {
    public static UIComponent getUIComponent(String platform) {
        UIComponent uiComponent = null;

        if(platform.equals("Android")) {
            uiComponent = new AndroidUIComponent();
        }
        else if(platform.equals("IOS")) {
            uiComponent = new IOSUIComponent();
        }
        return uiComponent;
    }
}
