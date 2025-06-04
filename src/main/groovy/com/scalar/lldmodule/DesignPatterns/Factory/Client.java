package com.scalar.lldmodule.DesignPatterns.Factory;

import com.scalar.lldmodule.DesignPatterns.Factory.Components.Button;
import com.scalar.lldmodule.DesignPatterns.Factory.Components.Menu;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.AndroidUIComponent;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.IOSUIComponent;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.UIComponent;
import com.scalar.lldmodule.DesignPatterns.Factory.factory.UIComponentFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String platform = sc.nextLine();
        //Taking Input fromm User.

        //Based on this platform
        // -> If platform - Android , -> Should get AndroidButton, AndroidMenu.
        // If platform = IOS -> should get IOSBUtton, IOSMenu.
        //Based on the platform, we should take configurational decision.

        //Flow :
        // Platform -> Android -> AndroidUIComponent -> AndroidUIComponentFactory.

//        UIComponent uiComponent = null;
//
//        if(platform.equals("Android")) {
//            uiComponent = new AndroidUIComponent();
//        }
//        else if(platform.equals("IOS")) {
//            uiComponent = new IOSUIComponent();
//        }
        //Moved Above if-else code blocks to a new helper class -> So that SPP does not get violated and code looks good.

        UIComponent uiComponent = UIComponentHelper.getUIComponent(platform);

        //Based on UIComponent -> Getting corresponding UIComponent Factory.
        UIComponentFactory uiComponentFactory = uiComponent.createUIComponentFactory();
        //Will get corresponding UI Factory
        //If IOS UI Component -> Gets Object of IOS UI Component Factory

        //Based on UIComponentFactory -> Getting corresponding Button.
        Button button = uiComponentFactory.createButton();
        button.clickButton();

        Menu menu = uiComponentFactory.createMenu();
        menu.checkMenu();
    }
}
