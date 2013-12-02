/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Controls;

import byui.cit260.ConnectFour.Models.Player;
import byui.cit260.ConnectFour.Models.Game;
import java.util.Scanner;
/**
 *
 * @author Noble
 */
public class ChangeMarker {
    
    private Game game;
    
    
    
    
    
    public ChangeMarker(Game game) {
        this.game = game;
        
    }
    
    public String getInput (Player player) {
        
        String newMarker = null;
        Scanner in = new Scanner(System.in);
        
        boolean valid = false; 
        while (!valid) {
            //Asks the User for their name
            System.out.println("\n\t" + player.getName()
                    + ", Enter a signle character for your marker");
            // gets input from the User
            newMarker = in.nextLine();
            
            if (newMarker == null  || newMarker.length() < 1) {
                continue;
            }
            //Converts Users input to uppercase for Marker
            newMarker = newMarker.substring(0,1).toUpperCase();
            
            if (newMarker.equals("Q")) {
                return null;
            }
            
           
           valid = true;
        }
        
        return newMarker;
    }
}
