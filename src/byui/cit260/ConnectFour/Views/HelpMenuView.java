/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Views;

import byui.cit260.ConnectFour.Controls.HelpMenuControl;
import byui.cit260.ConnectFour.Controls.ConnectFour;
import byui.cit260.ConnectFour.Controls.ConnectFourError;
import byui.cit260.ConnectFour.Models.Game;
import java.io.Serializable;
import java.util.Scanner;



/**
 *
 * @author Ryan
 */
public class HelpMenuView extends Menu {
    
    
    
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "A computer player"}, 
        {"O", "The Objective of the Game"},
        {"M", "A marker"},
        {"P", "A regular player"},        
        {"Q", "Quit"}        
    };

    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    
    public HelpMenuView() {
    }

    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }

    public String getInput() {
            
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            
        //get the entered command
           String command = this.getCommand();
           switch (command) {
               case "B":
                   this.helpMenuControl.displayBoardHelp();
                   break;
               case "C":
                   this.helpMenuControl.displayComputerHelp();
                   break;
               case "O":
                   this.helpMenuControl.displayGameObjective();
                   break;
               case "P":
                   this.helpMenuControl.displayRegularPlayer();
                   break;
               case"M":
                   this.helpMenuControl.displayMarker();
                   break;
               case "Q":
                   return "QUIT";
                }
                           
               } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
           }

           //display the menu
    
    
    @Override
    public final void display() {
        System.out.println("\n\t================================================================");
        System.out.println("\tEnter the letter of the option you wish to choose:");
        
        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t  "  + menuItems[i][0] + "\t"  + menuItems[i][1]);
    }
     System.out.println("\t============================================================================\n");
        
    }
                //gets the command from the user input
    @Override
    public final String getCommand() {
        
        Scanner inFile = ConnectFour.getInputFile();
        
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new ConnectFourError().displayError("Invalid input. Enter valid input.");
                continue;
            }
        }while (!valid);
        return command;
    }
    //determine if command is valid
    private boolean validCommand(String command) {
       
        
        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
       }
        return false;
 }

    @Override
    public void menuItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
