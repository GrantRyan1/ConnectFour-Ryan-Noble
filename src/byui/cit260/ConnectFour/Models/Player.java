/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Models;

/**
 *
 * @author Ryan
 */
public abstract class Player {
    
    public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER"; 
    public static final String ENHANCED_PLAYER = "ENHANCED_PLAYER";
    
    private String name;
    private String playerType;
    public String marker;
    public int wins = 0;
    public int losses = 0;



    public Player(){
    }
    
    public Player(String playerType, String marker) {
        this.marker = marker;
        this.playerType = playerType;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPlayerType() {
        return playerType;
    }
    
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
    
    public String getMarker() {
        return marker;
    }
    
    public void setMarker(String marker) {
        this.marker = marker;
    }     

    void setMarker(Object marker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}













