/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu.java;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class MainMenuJava {
        private static final String PLAYER_A_DEFAULT_MARKER = "X";
        private static final String PLAYER_B_DEFAULT_MARKER = "O";
        
        
        public Game create(String gameType) {
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
        if (gameType == null) {
            new ConnectFourError().display("MainCommands - create: gameType is null");
            return null;
        }
        
        if (gameType.equals(Game.ONE_PLAYER)) {
            game = new Game(Game.ONE_PLAYER);
            playerA = new Player(Player.REGULAR_PLAYER, PLAYER_A_DEFAULT_MARKER);
            playerB = new Player(Player.COMPUTER_PLAYER, PLAYER_B_DEFAULT_MARKER);
        }
        else if (gameType.equals(Game.TWO_PLAYER)) {
            game = new Game(Game.TWO_PLAYER);
            playerA = new Player(Player.REGULAR_PLAYER, PLAYER_A_DEFAULT_MARKER);
            playerB = new Player(Player.REGULAR_PLAYER, PLAYER_B_DEFAULT_MARKER);
            
        game.setPlayerA(playerA);
        game.setPlayerB(playerB);
        
        game.setStatus(Game.CONTINUE);
        
        return game;
    } 
    
        private String quitGame() {
        System.out.println("\n\tAre you sure? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return "EXIT";
        }

        return "PLAYING";
    }
}
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
}
