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
public class InnerClasses {

    public static void main(String[] args) {
        Bank b1 = new Bank("First bank");
        Bank b2 = new Bank("Second bank");
        try {
            b1.openAccount("John");
            b1.openAccount("Alex");
            b1.add("John", 10);
            b1.add("John", 15);
            b1.withdraw("John", 3);
            System.out.println(b1.balance("John"));  
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        Bank.Account a1 = b1.new Account();
        Bank.Account a2 = b1.new Account();
        Bank.Account a3 = b2.new Account();
        Bank.Account a4 = b2.new Account();
        
        a1.add(10);
        a2.add(11);
        a3.add(12);
        a4.add(13);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    } 
}
