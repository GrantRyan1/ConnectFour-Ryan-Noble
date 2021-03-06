/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Controls;

import byui.cit260.ConnectFour.Models.Board;
import byui.cit260.ConnectFour.Views.BoardView;
import byui.cit260.ConnectFour.Models.Game;
import byui.cit260.ConnectFour.Views.GameOptionsMenuView;
import byui.cit260.ConnectFour.Views.HelpMenuView;

/**
 *
 * @author Ryan
 */
public class PlayGameMenuControl {

    private Game game;
    private Board board;
    private BoardView displayBoard = new BoardView();
    
    public PlayGameMenuControl(Game game)  {
        this.game = game;
        this.board = game.getBoard();
    }
    
    
    public void takeTurn()  {
        System.out.println("\n\ttakeTurn() called");
    }
    
    public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
    }
    
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
        this.displayBoard();
    }
    
    public void displayOptionsMenu() {
        
        
        GameOptionsMenuView gameOptionsMenu = GameOptionsMenuView.GameOptionsMenuView();
        gameOptionsMenu.getInput(this.game);
    }
    
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = ConnectFour.helpMenu();
        helpMenu.getInput();
    }

    public PlayGameMenuControl(Game game, Board board) {
        this.game = game;
        this.board = board;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public BoardView getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(BoardView displayBoard) {
        this.displayBoard = displayBoard;
    }
    
    
}
