/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

/**
 *
 * @author Ryan
 */
public class GetLocation {

    int column;
    Player player;
    
    
    public GetLocation() {
        
    }
 }
       public void GetLocation(Player player) {
        this.player = player;
    }
    
    public void displayMarker() {
        if (this.player != null) {
            System.out.println(this.player.marker);
        }
        else {
            System.out.println(" ");
        }
    }