/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Models;

import byui.cit260.ConnectFour.Models.Player;

/**
 *
 * @author Noble
 */
public class PlayerEnhanced extends Player {

    public PlayerEnhanced(String name, String playerType, String marker) {
        this.name = name;
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public static final String ENHANCED_PLAYER = "ENHANCED_PLAYER"; 

    private String name;
    private String playerType;
    public String marker;
    
     public PlayerEnhanced(){
    }
     
      public PlayerEnhanced(String playerType, String marker) {
        this.marker = marker;
        this.playerType = playerType;
    }
      
    @Override
       public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getPlayerType() {
        return playerType;
    }
    
    @Override
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
    
    @Override
    public String getMarker() {
        return marker;
    }
    


    @Override
    void setMarker(Object marker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


