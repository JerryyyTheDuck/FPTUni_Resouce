/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;
import java.util.TreeSet;
import myTool.Tool;

/**
 *
 * @author Jack
 */
public class Product implements Comparable<Product> {

    final String letter_regEx = "^[a-zA-Z]{5,100}$";
    private String id;
    private String productName;
    private int unitPrice;
    private int quantity;
    private String status;
    private int numberForAvail;
    Scanner sc = new Scanner(System.in);

    public Product() {
        id = "";
        productName = "";
        unitPrice = 0;
        quantity = 0;
        status = "";
    }

    public Product(String id, String productName, int unitPrice, int quantity, String status) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void inputProduct() {
        id = Tool.input("Input products's id: ", letter_regEx, "id must only be characters and > 5");
        productName = Tool.input("Input prodct's name: ", letter_regEx, "product name must only characters");
        unitPrice = Tool.inpputNumber("Input Unit Price: ", "^([1-9][0-9]{0,3}|10000)$", "The unit price must be between 0 and 10000");
        quantity = Tool.inpputNumber("Input quantity: ", "^([1-9][0-9]{0,2}|1000)$", "The quantity must be between 0 and 1000");
        numberForAvail = Tool.inpputNumber("Input status [0(not available)/ 1 (available)]: ", "^[01]$", "Only input 0 for NOT AVAILABLE and 1 for AVAILABLE");
        if (numberForAvail == 0) {
            status = "Not available";
        } else {
            status = "Available";
        }

    }

    public void printProductList(TreeSet<Product> list) {
        for (Product p : list) {
            printProduct(p);
        }
    }

    public void printProduct(Product p) {
        System.out.format("%-10s%-20s%-15d%-20d%-15s\n", id, productName, unitPrice, quantity, status);

    }

    public void updateInfo() {
        Scanner sc = new Scanner(System.in);
        String id, productName, quantity, unitPrice, numberForAvail;
        while (true) {
            try {
                System.out.print("Input products's id: ");
                id = sc.nextLine().toUpperCase();
                if (id.isEmpty()) {
                    this.id = this.id;
                } else {
                    if (!id.matches(letter_regEx) || id.length() < 5) {
                        throw new Exception();
                    }
                    this.id = id;
                }
                break;
            } catch (Exception e) {
                System.out.println("ID must be character and lenght > 5");
            }
        }

        while (true) {
            try {
                System.out.print("Input prodct's name: ");
                productName = sc.nextLine().toUpperCase();
                if (productName.isEmpty()) {
                    this.productName = this.productName;
                } else {
                    if (!productName.matches(letter_regEx)) {
                        throw new Exception();
                    }
                    this.productName = productName;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid name");
            }
        }
        while (true) {
            try {
                System.out.print("Input Unit Price: ");
                unitPrice = sc.nextLine();
                if (unitPrice.isEmpty()) {
                    this.unitPrice = this.unitPrice;
                } else {
                    if (!unitPrice.matches("^([1-9][0-9]{0,3}|10000)$")) {
                        throw new Exception();
                    }
                    this.unitPrice = Integer.parseInt(unitPrice);
                }
                break;
            } catch (Exception e) {
                System.out.println("Unit price must be > 0 and < 10000");
            }
        }
        while (true) {
            try {
                System.out.print("Input quantity: ");
                quantity = sc.nextLine();
                if (quantity.isEmpty()) {
                    this.quantity = this.quantity;
                } else {
                    if (!quantity.matches("^([1-9][0-9]{0,2}|1000)$")) {
                        throw new Exception();
                    }
                    this.quantity = Integer.parseInt(quantity);
                }
                break;
            } catch (Exception e) {
                System.out.println("Quantity must be > 0 and < 1000");
            }
        }

        while (true) {
            try {
                System.out.print("Input status [0(not available)/ 1 (available)]: ");
                numberForAvail = sc.nextLine();
                if (numberForAvail.isEmpty()) {
                    this.numberForAvail = this.numberForAvail;
                } else {
                    if (!numberForAvail.matches("^[01]$")) {
                        throw new Exception();
                    }
                    this.numberForAvail = Integer.parseInt(numberForAvail);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Status must 0 for NOT AVAILABLE and 1 for AVAILABLE");
            }
        }
        if (this.numberForAvail == 0) {
            status = "Not available";
        } else {
            status = "Available";
        }

    }

    @Override
    public int compareTo(Product o) {
        if (this.getQuantity() < o.getQuantity()) {
            return 1;
        }
        if (this.getQuantity() == o.getQuantity()) {
            return this.unitPrice - o.unitPrice;
        }
        return -1;
    }

    @Override
    public String toString() {
        return id + ";" + productName + ";" + quantity + ";" + unitPrice + ";" + status;
    }

}
