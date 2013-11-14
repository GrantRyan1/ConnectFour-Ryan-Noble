/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.util.Scanner;
/**
 *
 * @author Noble
 */
public class MainMenuControl {
    
    
    public startNewGame(long noPlayers) { //Checks for Players to start new game.//
        
        if (noPlayers != 1  &&  noPlayers != 2) {
            new ConnectFourError().displayError("startGame wrong number of players entered.");
            return;
        }
        
        Game game = null;
        if (noPlayers == 1) {
            game = this.create("ONE_PLAYER");
        }
        if (noPlayers == 2) {
            game = this.create("TWO_PLAYER");
        }
        else {
            return;
        }
        PlayGameMenuView gameMenu = new PlayGameMenuView(game);
        gameMenu.getInput(game);
    }
    
      private Game create(String gameType) {
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
        if (gameType == null) {
            new ConnectFourError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        
         if (gameType.equals(Game.ONE_PLAYER)) {
            game = new Game(Game.ONE_PLAYER);
            playerA = new Player(Player.REGULAR_PLAYER, game.PLAYER_A_DEFAULT_MARKER);
            playerA.setName("Player 1");
            playerB = new Player(Player.COMPUTER_PLAYER, game.PLAYER_B_DEFAULT_MARKER);
            playerB.setName("Computer");
        }
        else if (gameType.equals(Game.TWO_PLAYER)) {
            game = new Game(Game.TWO_PLAYER);
            playerA = new Player(Player.REGULAR_PLAYER, game.PLAYER_A_DEFAULT_MARKER);
            playerA.setName("Player 1");
            playerB = new Player(Player.REGULAR_PLAYER, game.PLAYER_B_DEFAULT_MARKER);
            playerB.setName("Player 2");

        }
        
        
        
        game.PlayerA = playerA;
        game.PlayerB = playerB;
        
        return game;
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }

    private static class GameMenuView {

        public GameMenuView() {
        }

       

      

        private void getInput(Game game) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
