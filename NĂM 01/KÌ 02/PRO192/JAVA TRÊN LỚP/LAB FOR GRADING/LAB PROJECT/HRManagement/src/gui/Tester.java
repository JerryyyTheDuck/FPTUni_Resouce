/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basic.Manager;
import basic.Staff;

/**
 *
 * @author user
 */
public class Tester {
    public static void main(String[] args) {
        Staff x=new Staff();
        x.inputStaff();
        x.outputStaff();
        
        Manager y=new Manager();
        //y.inputManager();
        y.inputStaff();
        //y.outputManager();
        y.outputStaff();
        
        x=new Manager();
        x.inputStaff();
        x.outputStaff();
        //((Manager)z).inputManager();
        //((Manager)x).outputManager();
    }
}
