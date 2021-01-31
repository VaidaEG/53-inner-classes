/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner.classes;

public class DublicateAccountException extends Exception {
    public DublicateAccountException() {
    }
    public DublicateAccountException(String message) {
        super(message);
    }
    public DublicateAccountException(String message, Throwable cause) {
        super(message, cause);
    }
    public DublicateAccountException(Throwable cause) {
        super(cause);
    } 
}
