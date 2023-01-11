package basic;

import mylib.Validation;



public class sinhVien {

    //method
    private int ma;
    private String ten;
    private String gioiTinh;

    //default constructors: 
    //tên hàm giống tên lớp
    // không được phép để kiểu dữ liệu
    // chỉ được run sau chữ new, nó luôn đứng sau chữ new
    public sinhVien() {
        ma = 0;
        ten = "";
        gioiTinh = "";
    }

    public sinhVien(int ma, String ten, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public sinhVien(sinhVien C) {
        ma = C.ma;
        ten = C.ten;
        gioiTinh = C.gioiTinh;
    }

    //setters 
    //để sửa tên field khi cần
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    //getters
    public String getTen() {
        return ten;
    }

    public int getMa() {
        return ma;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

//    public void nhapSV(){
//            Scanner s = new Scanner(System.in);
//            System.out.println("nhap ma:");
//            ma=s.nextInt();
//        
//            System.out.println("Nhap ten:");
//            ten=s.nextLine();
//            
//            s.nextLine();
//            System.out.println("nhap gioi tinh:");
//            gioiTinh=s.nextLine();
//    }
    public void xuatSV() {
        System.out.println("ma SV: " + ma);
        System.out.println("ten SV: " + ten);
        System.out.println("gioi tinh SV: " + gioiTinh);
    }

    public void nhapSV() {
        boolean flag = false;
        do {
            try {
                ma = (int) Validation.inputNumber("Nhap ma: ", 1, 100);
                ten = Validation.inputString("Nhap ten: ", "^[a-zA-Z]+(a-za-Z )*$");
                gioiTinh = Validation.inputString("Nhap gioi tinh: ", "^([nN][aA][mM])||([Nn][Uu])");
                flag = true;
            } catch (Exception ex) {
                System.out.println("nhap thong tin sai");
            }
        } while (!flag);

        while (!flag) {
            try {
                ma = (int) Validation.inputNumber("Nhap ma: ", 1, 100);
                ten = Validation.inputString("Nhap ten: ", "^([a-zA-Z]{2,}\\\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\\\s?([a-zA-Z]{1,})?)");
                gioiTinh = Validation.inputString("Nhap gioi tinh: ", "^([nN][aA][mM])||([Nn][Uu])");
            } catch (Exception e){
                System.out.println("nhap thong tin sai");
            }
        }
    }

}
