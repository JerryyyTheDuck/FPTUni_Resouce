/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class Carp {
    private String pond; 
    private int size; 
    public Carp(){
    
    }

    public Carp(String pond, int size) {
        this.pond = pond;
        this.size = size;
    }

    public String getPond() {
        return pond.substring(0,2).toLowerCase() + pond.substring(2);
    }

    public int getSize() {
        return size;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
