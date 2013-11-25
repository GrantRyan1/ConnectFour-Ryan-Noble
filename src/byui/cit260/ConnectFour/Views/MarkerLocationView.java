/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Views;

import byui.cit260.ConnectFour.Models.Game;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
import java.awt.Point;

public class MarkerLocationView {
        private Game game;
        
        public MarkerLocationView(Game game) {
               this.game = game;
        }
        
        public Point getInput() {
            
            Scanner inFile = new Scanner(System.in);
            String[] column;
            Point location = null;
            
            boolean valid = false;
            return null;
        
            
            
            
        }


    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
        
        
        
        
        
        
        
}
