/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner.classes;

/**
 *
 * @author 37067
 */
public class NoSuchAccountException extends Exception {

    public NoSuchAccountException() {
    }

    public NoSuchAccountException(String message) {
        super(message);
    }

    public NoSuchAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchAccountException(Throwable cause) {
        super(cause);
    } 
}
