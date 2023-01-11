/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.gui;

import dto.BeeColony;
import dto.Colony;
import dto.FPTUniversity;
import dto.Role;
import dto.University;

/**
 *
 * @author green
 */
public class Tester{

   public static void main(String[] args){

        Colony obj1 = new BeeColony("honey", "land", 2000);
        System.out.println(obj1);
        obj1.grow();
        obj1. reproduce();

        University obj2=new FPTUniversity( "FPT", "Cantho",100000);
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df= new BeeColony("wasp", "land",3000);
        System.out.println(df);
        df.creatWorker();
    
        df= new FPTUniversity( "FPT", "Hanoi",100000);
        System.out.println(df);
        df.creatWorker();
            
    }
}

