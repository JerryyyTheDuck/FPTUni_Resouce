/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import Library.SLL;

/**
 *
 * @author green
 */
public class book extends SLL<book> implements Comparable<book>{

    private String tcode;
    private String ccode;
    private int seat;


    public book() {
    }
    public book(String tcode, String ccode, int seat) {
        this.tcode = tcode;
        this.ccode = ccode;
        this.seat = seat;
    }

    public String getTcode() {
        return tcode;
    }
    public String getCcode() {
        return ccode;
    }

    @Override
    public int compareTo(book o) {
        return this.seat - o.seat;
    }
    @Override
    public String toString() {
        return tcode + " | " + ccode + " | " + seat;
    }
    
}
