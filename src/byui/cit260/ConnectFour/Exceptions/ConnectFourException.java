/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ConnectFour.Exceptions;

/**
 *
 * @author Noble
 */
public class ConnectFourException extends Exception {

    public ConnectFourException() {
    }

    public ConnectFourException(String message) {
        super(message);
    }

    public ConnectFourException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectFourException(Throwable cause) {
        super(cause);
    }
    
}
