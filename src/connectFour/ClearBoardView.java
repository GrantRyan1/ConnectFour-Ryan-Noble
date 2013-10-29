/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

/**
 *
 * @author Ryan
 */
public class ClearBoardView {
    
    private Object board;
    private Object game;
    
    //explanation of code: 1st sees the board and the spots that are filled
    
    public void clearTheBoard() {
        Player[][] locations = this.game.getBoard().getBoardLocations();
        
        //the for loop puts i at 0 ; i is less than the length of the board; i counts up 
        for (int i = 0; i < this.board.getBoardLocations().length; i++) {
            //for all the locations chosen by the players = i which = 0
            Player[] rowlocations = locations[i];
            //the j variable is the same explanation as the i loop; sets all the j locations to "null"
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        
        }
   }
 
}