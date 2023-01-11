
import java.util.Scanner;

public class Cuocsongmuomau {

    public static void main(String[] args) {
        int c = 0;
        LivingBeing obj = null;
        do {
            System.out.println("1. Tao 1 con komondo");
            System.out.println("2. tao 1 cay bat ruoi");
            System.out.println("3. test all method cua 1 trong 2");
            System.out.print("Nhap lua chon:");
            Scanner s = new Scanner(System.in);
            c = Integer.parseInt(s.nextLine());
            switch (c) {
                case 1:
                    obj = new Komondo();
                    obj.setName("Nguyen");
                    
                    System.out.println("Komondo ten: " + obj.getName());
                    break;
                case 2:
                    obj = new Venus();
                    obj.setName("bat ruoi");
                    System.out.println("Cay bat ruoi ten: "+ obj.getName());
                    break;
                case 3:
                    if (obj != null) {
                        obj.useWater();
                        System.out.println("--------------------");
                        obj.grow();
                        System.out.println("--------------------");
                        if (obj instanceof Animal) {
                            ((Animal) obj).run();
                        }
                        Food temp = (Food) obj;
                        temp.eatbug();
                    }
                    break;
            }
        } while (c <= 3);
    }
}
