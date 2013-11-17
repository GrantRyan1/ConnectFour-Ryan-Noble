/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.io.Serializable;

/**
 *
 * @author Noble
 */
public class HelpMenuControl implements Serializable {
   
     public HelpMenuControl() {
}
     
     public void displayBoardHelp() {
         System.out.println();
         this.displayHelpBoarder();
         System.out.println(
                 "\tThe game board for Connect Four. It consists of a grid of "
                 + "\n\tslots in a 7 by 7 format. Players place there markers on the "
                 + "\n\tboard and try to create a line of four of their pieces either "
                 + "\n\thorizontally, vertically, or diagonal. Whoever gets there four "
                 + "\n\tin a row first wins the game!");
         displayHelpBoarder();
     }


    public void displayGameObjective() {
        System.out.println();
        displayHelpBoarder();
        System.out.println(
                "\tThe objective of the game is to be the first player to lay down "
                + "\n\tfour of their gaming pieces in a row to win the game. Each player "
                + "\n\ttakes turns placing their pieces down in one location on the board "
                + "\n\tafter another."
                );
       displayHelpBoarder();
}
        public void displayRegularPlayer() {
            System.out.println();
            displayHelpBoarder();
            System.out.println(
                    "\tA player is manually controled by the user and takes turns placing"
                    + "\n\ttheir pieces on the board in an unused location."
                    );
            displayHelpBoarder();
}

        public void displayComputerHelp() {
            System.out.println();
            displayHelpBoarder();
            System.out.println(
                    "\tA computer based player automatically takes its turn "
                    + "\n\tright after the real player in the single player mode."
                    );
             displayHelpBoarder();
}

    public void displayMarker() {
        System.out.println();
        displayHelpBoarder();
        System.out.println(
                "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"X\" and \"O\"."
                );
        displayHelpBoarder();

}

        public void displayHelpBoarder() {
            System.out.println(
            "\t=================================================================");
        }
        
}