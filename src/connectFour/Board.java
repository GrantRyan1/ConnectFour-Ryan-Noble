/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.awt.Point;

/**
 *
 * @author Ryan
 */
public class Board {

    
    int rowCount = 7;
    int columnCount = 7;
    private String name;
    private Point boardDimensions = new Point();
    private Player[][] boardLocations;
    
    public Board() {
    }
    
    public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new Player[noRows][noColumns];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Point getDimensions() {
        return boardDimensions;
    }
    public void setBoardDimensions(Point boardDimensions) {
        this.boardDimensions = boardDimensions;
    }
    public Player[][] getBoardLocations() {
        return boardLocations;
    }
    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }

    int getRowCount() {
        return (int) this.boardDimensions.getX();
    }

     public class Location {

        private int row;
        private int column;
        private String value;
        private Player player;

        Location() {
        }

        int getRow() {
            return row;
        }

        void setRow(int row) {
            this.row = row;
        }

        int getColumn() {
            return column;
        }

        void setColumn(int column) {
            this.column = column;
        }
         Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }
        
        String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            return coordinates;
        }
        
  }
    public Player getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }
    
    int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clearBoard() {
        for (int i = 0; i < this.boardLocations.length; i++) {
            Player[] rowlocations = this.boardLocations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                Player location = rowlocations[j];
                location = null;
            }
        }
    }
}
