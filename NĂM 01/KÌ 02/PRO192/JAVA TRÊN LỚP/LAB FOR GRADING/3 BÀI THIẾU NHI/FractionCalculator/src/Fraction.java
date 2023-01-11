import java.util.Scanner;
public class Fraction {
    private int tuSo,mauSo;
    //==================================
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        tuSo = s.nextInt();
        System.out.println("Nhập mẫu số: ");
        mauSo = s.nextInt();
    }
    
    public void xuat(){
        System.out.println("Tử số là: ");
        System.out.println("Mẫu số là: ");
    }
    public Fraction tinTong(int x, int y){
        int temp1 = mauSo*x+tuSo*y;
        int temp2 = mauSo*y;
        Fraction result = new Fraction();
        result.mauSo = temp2;
        result.tuSo = temp1;
        return result;
    }
    public Fraction tinhTong(Fraction P){
        int temp1 = mauSo*P.tuSo + tuSo*P.mauSo;
        int temp2 = mauSo * P.mauSo;
        Fraction result = new Fraction();
        result.mauSo = temp2; 
        result.tuSo = temp1;
        return result; 
    }
    
}
