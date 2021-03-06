/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Views;

import byui.cit260.ConnectFour.Views.MainMenuView;
import java.util.Scanner;
/**
 *
 * @author Noble
 */
public abstract class Menu {
    
     private String[][] menuItems = null;
     
      public Menu() {
}
      public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
      public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
            
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    public abstract menuItems();
    
     private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
     public abstract String getCommand();
     
    
    
}
