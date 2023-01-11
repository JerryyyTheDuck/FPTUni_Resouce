
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    int ma;
    String ten;
    String gioiTinh;
    Laptop laptop;

    public Student() {
        ma = 0;
        ten = "";
        gioiTinh = "";
        laptop = new Laptop();
    }
    public Student(int ma, String ten, String gioiTinh, Laptop laptop) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }
    public int getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void nhapSV() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhap ma:");
                ma = Integer.parseInt(s.nextLine());
                if (ma <= 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("error");
            }

        }

        System.out.println("Nhap ten:");
        ten = s.nextLine();

        s.nextLine();
        System.out.println("nhap gioi tinh:");
        gioiTinh = s.nextLine();
        laptop.input();
    }
    public void xuatSV() {
        System.out.println("ma SV: " + ma);
        System.out.println("ten SV: " + ten);
        System.out.println("gioi tinh SV: " + gioiTinh);
        laptop.output();
    }
}
