/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class SpecCarpet extends Carpet {
    private int color;
    public SpecCarpet(){}

    public SpecCarpet(String maker, int size,int color ) {
        super(maker, size);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color; 
    }
    
    public void setData(){
        String maker = super.getMaker();
        super.setMaker(maker.substring(0,2) + "HOA"+ maker.substring(4));
    }
    public int getValue(){
        if(super.getSize()<6){
         return color +5;
        }else{
            return color + 7;
        }
    }
}
