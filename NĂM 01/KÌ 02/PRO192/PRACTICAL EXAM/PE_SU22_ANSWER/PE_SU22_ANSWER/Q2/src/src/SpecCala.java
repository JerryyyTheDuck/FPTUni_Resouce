/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class SpecCala extends Cala{
    private int color; 

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public void setData(){
        setOwner(getOwner().substring(0, 2) + "XX" + getOwner().substring(3,getOwner().length()));
    }
    public int getValue(){
        if(getColor()%2 != 0){
            return getPrice() + 7;
        }
        return getPrice()+3;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
    
}
