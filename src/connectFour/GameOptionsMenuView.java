/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class GameOptionsMenuView {

    private Game game;
    private GameOptionsMenuControl gameOptionsControl = new GameOptionsMenuControl();
    
    private final static String[][] menuItems = {
        {"1", "Change Marker of the First Player"},
        {"2", "Change Marker of the Second Player"},
        {"D", "Change the dimensions of the board"}, 
        {"Q", "Return to Game Menu"}
    };
    private Object gameOptionsMenuControl;
    
    public GameOptionsMenuView() {
       }
   
    
    public Object getInput(Object object) {
        this.game = (Game) object;
        this.gameOptionsControl.setGame(game);
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
    
            
            String command = this.getCommand();
            switch (command)  {
               case "1":
                    this.gameOptionsControl.getMarker(this.game.getPlayerA());
                    break;
                case "2":
                    this.gameOptionsControl.getMarker(this.game.getPlayerB());
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
    
    protected final String getCommand() {

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
    
}
    
 
