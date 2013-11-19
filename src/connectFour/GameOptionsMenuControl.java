/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.awt.Dimension;
/**
 *
 * @author Noble
 */
public class GameOptionsMenuControl {
    
    private Game game;
    private Object marker;
    public Player PlayerA;
    public Player PlayerB;
    public Object dimensions;
    public Object locations;
    
    public GameOptionsMenuControl() {
    }

    GameOptionsMenuControl(Game game) {
     this.game = game;   
     this.marker = marker;
    }
    public Game getgame() {
        return game;
    }
   
    public void setGame(Game game) {
        this.game = game;
    }

   
    public boolean saveMarker(Player player, String Marker) {
         if (player == null  ||  marker == null) {
            new ConnectFourError().displayError("saveMarker - player or marker is invalid");
            return false;
        }

   
        if (game.getPlayerA().equals(game.getPlayerB())) {
            new ConnectFourError().displayError("Both players can not use the same character for a marker.");
            return false;
        }
        
        // update the players markers
        player.setMarker(marker);
        
        return true;
    }
    
    public boolean saveDimensions(Dimension dimension)  {
        // validate inputs
        if (this.game.getStatus().equals(game.PLAYING)) {
            new ConnectFourError().displayError("You can not change the dimensions "
              + "of the board once the game has been started. "
              + "\nStart a new game and then change the dimensions "
              + "of the board. ");
            return false;
        }
        
        if (dimension == null) {
            new ConnectFourError().displayError(
                    "The number of rows must be between 3 -10 and the "
                    + "number of columns must be between 3 -10 ");
            return false;
        }
        
        int boardRowCount = dimension.width;
        int boardColumnCount= dimension.height;
        
        if (boardRowCount < 3 || boardRowCount > 10) {
            new ConnectFourError().displayError(
                    "The number of rows must be between 3 -10 and the "
                    + "number of columns must be between 3 -10 ");
            return false;
        }

        if (boardColumnCount < 3 || boardColumnCount > 10) {
            new ConnectFourError().displayError(
                    "The number of rows must be between 3 -10 and the "
                    + "number of columns must be between 3 -10 ");
            return false;
        }

        // no change in the board size so return
        if (boardRowCount == this.game.getBoard().getRowCount() &&
            boardColumnCount == this.game.getBoard().getColumnCount()) {
            return true;
        }
        
        // change the size board
        Player[][] locations = new Player[boardRowCount][boardColumnCount];
        this.game.getBoard().getDimensions();
        
        
        Dimension dimensions = new Dimension(boardRowCount, boardColumnCount);
        
        return true;
    }

    public Object getMarker() {
        return marker;
    }

    public void setMarker(Object marker) {
        this.marker = marker;
    }

    public Player getPlayerA() {
        return PlayerA;
    }

    public void setPlayerA(Player PlayerA) {
        this.PlayerA = PlayerA;
    }

    public Player getPlayerB() {
        return PlayerB;
    }

    public void setPlayerB(Player PlayerB) {
        this.PlayerB = PlayerB;
    }

    public Object getDimensions() {
        return dimensions;
    }

    public void setDimensions(Object dimensions) {
        this.dimensions = dimensions;
    }

    public Object getLocations() {
        return locations;
    }

    public void setLocations(Object locations) {
        this.locations = locations;
    }

}

    
