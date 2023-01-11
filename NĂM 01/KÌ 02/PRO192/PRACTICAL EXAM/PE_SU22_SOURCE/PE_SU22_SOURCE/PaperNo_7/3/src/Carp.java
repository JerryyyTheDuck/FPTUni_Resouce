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
    private int state;
    public Carp(){
    }

    public Carp(String pond, int state) {
        this.pond = pond;
        this.state = state;
    }

    public String getPond() {
        return pond;
    }

    public int getState() {
        return state;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    
}
