/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Tester {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        System.out.println("Mời nhập phân số thứ nhất");
        a.nhap();
        a.xuat();
        
        System.out.println("Mời nhập phân số thứ hai");
        b.nhap();
        b.xuat();
        
        Fraction c = a.tinhTong(b);
        System.out.println("Kết quả là: ");
        c.xuat();
        
    }
}
