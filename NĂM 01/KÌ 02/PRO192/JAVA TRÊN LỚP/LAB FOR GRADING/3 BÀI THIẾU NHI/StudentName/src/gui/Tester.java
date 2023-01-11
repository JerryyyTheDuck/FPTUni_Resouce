package gui;

import basic.sinhVien;

/**
 *
 * @author USER
 */
public class Tester {

    public static void main(String[] args) {
        //tạo object sinh viên thứ nhất

        sinhVien a = new sinhVien();
        a.nhapSV();
        a.xuatSV();

        System.out.println("===================");

        //==============================================
        sinhVien c = new sinhVien(100, "Son tung", "trai");
        c.xuatSV();
        System.out.println("===================");

        sinhVien d = new sinhVien(c);
        d.xuatSV();
        System.out.println("===================");
        d.setTen("Hai Tu");
        d.setGioiTinh("nu");
        d.xuatSV();
        System.out.println("===================");
        System.out.println("ten cua d: " + d.getTen());

    }
}
