/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

/**
 *
 * @author Ryan
 */
public class Player {
    
    public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER"; 

    private String name;
    private String playerType;
    public String marker;
    



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













