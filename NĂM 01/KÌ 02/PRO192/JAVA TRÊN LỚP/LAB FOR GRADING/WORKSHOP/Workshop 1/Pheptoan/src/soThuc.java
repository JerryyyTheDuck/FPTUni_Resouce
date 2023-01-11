
import java.util.Scanner;

public class soThuc {

    Scanner s = new Scanner(System.in);
    double num;

    public void nhap() {
        while (true) {
            try {
                System.out.print("Input number:");
                num = Double.parseDouble(s.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
        }

    }

    public double sum(soThuc C) {
        double tong;
        tong = num + C.num;
        return tong;
    }

    public double minus(soThuc C) {
        double hieu;
        hieu = num - C.num;
        return hieu;
    }

    public double product(soThuc C) {
        double nhan;
        nhan = num * C.num;
        return nhan;
    }

    public double divide(soThuc C) {
        double chia;
        chia = num / C.num;
        return chia;
    }

}
