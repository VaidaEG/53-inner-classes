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
public class Bank {
    private String name;
    private MyList people;
    private MyList accounts;
    
    public Bank(String name) {
        this.name = name;
        people = new MyList();
        accounts = new MyList();
    }
    private Account getAccount(String name) {
        if (name == null) {
            return null;    
        }
        for (int i = 0; i < people.size(); i++) {
            if (name.equals(people.get(i))) {
                return (Account) accounts.get(i);
            }
        }
        return null;   
    } 
    public void openAccount(String name) throws DublicateAccountException {
        if (this.getAccount(name) == null) {
            people.add(name);
            accounts.add(new Account());
        } else {
            throw new DublicateAccountException("Person " + name  + "already has account in this bank.");
        }
    }
    public void add(String name, double howMuch) throws NoSuchAccountException {
        Account a = this.getAccount(name);
        if (a == null) {
            throw new NoSuchAccountException("Person " + name + " doesn't have account in this bank.");
        }
        a.add(howMuch);
    }
    public void withdraw(String name, double howMuch) throws NotEnoughFundsException, NoSuchAccountException {
        Account a = this.getAccount(name);
        if (a == null) {
            throw new NoSuchAccountException("Person " + name + " doesn't have account in this bank.");
        }
        a.withdraw(howMuch);
    }
    public double balance(String name) throws NoSuchAccountException {
        Account a = this.getAccount(name);
        if (a == null) {
            throw new NoSuchAccountException("Person " + name + " doesn't have account in this bank.");
        }
        return a.getSum();
        
    }
    private class Account {
        private double sum;
        public Account() {
            this.sum = 0;
        }
        public void add(double howMuch) {
            if (howMuch > 0) {
                this.sum += howMuch;
            }
        }
        public void withdraw (double howMuch) throws NotEnoughFundsException {
            if (howMuch <= 0) {
                return;
            }
            if (this.sum - howMuch < 0) {
                throw new NotEnoughFundsException("Not enough money in the account");
            }
            this.sum -= howMuch;
        }
        public double getSum() {
            return this.sum; 
        }
        @Override
        public String toString() {
            return "Bank " + name + ". Account{" + "sum = " + sum + '}';
        }
    }
}
