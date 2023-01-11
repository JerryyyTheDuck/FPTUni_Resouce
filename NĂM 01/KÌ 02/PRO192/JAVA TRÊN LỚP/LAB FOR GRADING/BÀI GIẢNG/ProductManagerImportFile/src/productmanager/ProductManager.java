/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanager;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class ProductManager {

    public static void main(String[] args) {
        int choice = 0;
        ProductList x = new ProductList(); //ham nay da doc xong file data.csv

        do {
            System.out.println("1.Display all");
            System.out.println("2. update product by id");
            System.out.println("3. Find product by id");
            System.out.println("4. add a new product");
            System.out.print("Enter choice: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    x.displayProducts();
                    System.out.println("=========================");
                    break;
                case 4:
                    int id,
                     price;
                    String name,
                     unit;
                    System.out.print("Enter id: ");
                    id = s.nextInt();
                    s = new Scanner(System.in);
                    System.out.print("Enter price: ");
                    price = s.nextInt();
                    s = new Scanner(System.in);
                    System.out.print("Enter name: ");
                    name = s.nextLine();
                    System.out.print("Enter unit: ");
                    unit = s.nextLine();
                    Product p = new Product(id, name, price, unit);
                    if (x.addProduct(p)) {
                        System.out.println("added");
                    } else {
                        System.out.println("Error");
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
