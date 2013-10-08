/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 * comp player, 
 * @author Ryan
 */
public class Board{
    int boardDimensions;
    private int boardHeighth;
    private int boardWidth;
    
    public Board(String name){
        System.out.println(Board);
    }

    private Board() {
        throw new UnsupportedOperationException("Not supported yet."); //NO IDEA WHERE THIS CAME FROM""" body of generated methods, choose Tools | Templates.
    }
    public board setDimensions(int dimensions){
        boardDimensions = dimensions;
}

    public int getWidth(){
        System.out.println(Width);
        return boardWidth;
    }
    
    public int getHeighth(){
        System.out.println(Width);
        return boardHeighth;
    }  
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Board newBoard = new Board 
       
       newBoard.setWidth(7);
       newBoard.setHeighth(7);
       
       System.out.println(boardHeighth.setHeighth + boardWidth.setWidth )
    }

    private void setHeighth(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setWidth(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
