/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Views;

import byui.cit260.ConnectFour.Controls.GameOptionsMenuControl;
import byui.cit260.ConnectFour.Controls.ConnectFour;
import byui.cit260.ConnectFour.Controls.ConnectFourError;
import byui.cit260.ConnectFour.Models.Game;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class GameOptionsMenuView extends Menu {

    private Game game;
    private GameOptionsMenuControl gameOptionsControl;
    
    private final static String[][] menuItems = {
        {"1", "Change Marker of the First Player"},
        {"2", "Change Marker of the Second Player"},
        {"D", "Change the dimensions of the board"}, 
        {"Q", "Return to Game Menu"}
    };
    private final GameOptionsMenuControl GameOptionsMenuControl;
  
    

    public GameOptionsMenuView(Game game) {
       this.game = game;
       this.GameOptionsMenuControl = new GameOptionsMenuControl(game);
    
    }
   
    
    public Object getInput(Object object) {
        this.game = (Game) object;
        this.GameOptionsMenuControl.setGame(game);
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
    
            
            String command = this.getCommand();
            switch (command)  {
               case "1":
                    this.gameOptionsControl.getPlayerA();
                    break;
                case "2":
                    this.gameOptionsControl.getPlayerB();
                    break;
                case "D":
                    this.gameOptionsControl.getDimensions();
                    break;
                case "Q":
                    return Game.QUIT; 
                
            }
        } while (!gameStatus.equals(Game.QUIT));

        return gameStatus;
    }

    
    
    @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameOptionsMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private boolean validCommand(String command) {
        String[][] items = GameOptionsMenuView.menuItems;

        for (String[] item : GameOptionsMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    public final String getCommand() {

        Scanner inFile = ConnectFour.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new ConnectFourError().displayError("Invalid input. Please enter a valid input.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }

    @Override
    public void menuItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
 
