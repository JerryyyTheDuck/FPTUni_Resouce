
import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase: ");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting");
            System.out.println("4. Display Item");
            System.out.print("Input a choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
                    item.input();
                    break;
                case 2:
                    item = new Statue();
                    item.input();
                    break;
                case 3:
                    item = new Painting();
                    item.input();
                    break;
                case 4:
                    if(item != null){
                        item.output();
                    }else{
                        System.out.println("Missing input");
                        System.out.println("==============");
                    }
                    break;
            }

        } while (choice <= 4);
    }
}
