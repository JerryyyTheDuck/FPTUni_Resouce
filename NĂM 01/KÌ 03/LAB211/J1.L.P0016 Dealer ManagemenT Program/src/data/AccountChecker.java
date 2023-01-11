/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author green
 */
public class AccountChecker {
    private Account acc;
    public AccountChecker(){
        acc =null;
    }
    public AccountChecker(Account acc) {
        this.acc = acc;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
    
    
    
}
