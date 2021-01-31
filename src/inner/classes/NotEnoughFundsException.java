/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner.classes;

public class NotEnoughFundsException extends Exception {

    public NotEnoughFundsException() {
    }
    public NotEnoughFundsException(String message) {
        super(message);
    }
    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
    public NotEnoughFundsException(Throwable cause) {
        super(cause);
    } 
}
