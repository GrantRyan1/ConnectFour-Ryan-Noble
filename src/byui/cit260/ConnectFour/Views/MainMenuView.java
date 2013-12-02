/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Views;

import byui.cit260.ConnectFour.Views.HelpMenuView;
import byui.cit260.ConnectFour.Controls.MainMenuControl;
import byui.cit260.ConnectFour.Controls.ConnectFour;
import byui.cit260.ConnectFour.Controls.ConnectFourError;
import byui.cit260.ConnectFour.Models.Game;
import java.util.Scanner;
/**
 *
 * @author Noble
 */
public class MainMenuView extends Menu {
    
     

    public static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"X", "Exit Connect Four"}
    }; 
    
    MainMenuControl mainMenuControl = new MainMenuControl() {

        @Override
        public void menuItems() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }; 
    
     public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    public void getInput() {
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            
            // gets command entered by user
            String command = this.getCommand();
            switch (command) {
                case "1":
                    this.mainMenuControl.startNewGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startNewGame(2);
                    break;
                case "H":
                  this.mainMenuControl.displayHelpMenu();
                  HelpMenuView helpMenu = ConnectFour.helpMenu();
                  helpMenu.getInput();
                     break;
                case "X":
                    break;
            }
        }  while (!gameStatus.equals("QUIT"));
         
        return;
}
    
    
    
    @Override
    public final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do{
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command));
            if (!validCommand(command)) {
                new ConnectFourError().displayError("Invalid command. Please enter a vaild command.");
                   continue;
               }

        } while (!valid);
        
        return command;
   }




    private boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

  

    private void Error(String invalid_command_Please_enter_a_vaild_comm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }

    @Override
    public void menuItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
    
}

