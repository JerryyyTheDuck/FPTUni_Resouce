/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.*;
import myTool.Tool;

/**
 *
 * @author Jack
 */
public class ProductList {

    TreeSet<Product> list = Tool.readFile();

    public boolean checkEmpty() {
        return list.isEmpty();
    }

    public void writeFile() {
        Tool.writeFile(list);
    }

    public void readCurrentSaveFile() {
        TreeSet<Product> list1 = Tool.readFile();
        if (!list1.isEmpty()) {
            System.out.println("==========Product List===========");
            System.out.format("%-10s%-20s%-15s%-20s%-15s\n", "ID", "PRODUCT NAME", "UNIT PRICE", "QUANTITY", "STATUS");
            for (Product product : list1) {
                product.printProduct(product);
            }
        } else {
            System.out.println("There is no data in save file");
        }
    }

    public void addProductInList() {
        Product p = new Product();
        int index = 0;
        p.inputProduct();
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            String name = product.getProductName();
            if (name.equalsIgnoreCase(p.getProductName())) {
                System.out.println("Cannot input because product name is the same");
                index++;
            }
        }
        if (index == 0) {
            list.add(p);
        }
    }

    public void addProductInList(Product p) {
        list.add(p);
    }

    public void displayProduct() {
        if (list.isEmpty()) {
            System.out.println("Nothing to print");
        } else {
            System.out.println("==========Product List===========");
            System.out.format("%-10s%-20s%-15s%-20s%-15s\n", "ID", "PRODUCT NAME", "UNIT PRICE", "QUANTITY", "STATUS");
            for (Product product : list) {
                product.printProduct(product);
            }
        }
    }

    public void searchProuductByName() {
        Scanner sc = new Scanner(System.in);
        TreeSet<Product> list1 = Tool.readFile();
        int index = 0;
        if (!list1.isEmpty()) {
            String name = Tool.input("Input name to search: ", "^[a-zA-Z]+$", "product name must only characters");
            for (Product product : list1) {
                if (product.getProductName().equalsIgnoreCase(name)) {
                    index++;
                }
            }
            if (index > 0) {
                System.out.println("Existed Product");
            } else {
                System.out.println("No product found");
            }
        }
    }

    public Product searProductByID() {
        Scanner sc = new Scanner(System.in);
        if (!list.isEmpty()) {
            String id = Tool.input("Input id to search: ", "^[a-zA-Z]+$", "id must only be characters and > 5");
            for (Product product : list) {
                if (product.getId().equalsIgnoreCase(id)) {
                    return product;
                }
            }
        }
        return null;
    }

    public void searchProductByNameContain() {
        TreeSet<Product> list1 = new TreeSet<>();
        if (!list.isEmpty()) {
            String name = Tool.input("Input name to search: ", "^[a-zA-Z]+$", "product name must only characters");
            for (Product product : list) {
                if (product.getProductName().contains(name)) {
                    list1.add(product);
                }
            }
            if (!list1.isEmpty()) {
                System.out.println("==========Product List===========");
                System.out.format("%-10s%-20s%-15s%-20s%-15s\n", "ID", "PRODUCT NAME", "UNIT PRICE", "QUANTITY", "STATUS");
                for (Product product : list1) {
                    product.printProduct(product);
                }
            } else {
                System.out.println("No product with this name");
            }
        }

    }

    public void deleteProductByID(String id) {
        if (list.isEmpty()) {
            System.out.println("Nothing to delete");
        } else {
            Iterator<Product> iterator = list.iterator();
            while (iterator.hasNext()) {
                Product p = iterator.next();
                if (p.getId().toUpperCase() == id) {
                    iterator.remove();
                }
//                else {
//                    System.out.println("Productname does not exist");
//                }
            }
        }
    }

    public void remove(Product p) {
        Iterator<Product> iterator = list.iterator();
//        int i = 0;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.equals(p)) {
//                if (i > 0) {
                    iterator.remove();
//                }
//                i++;
            }
        }
    }

    public Product updateItemInfo(Product p) {
        p.updateInfo();
        return p;
//        Product p1 = new Product(p.getId(), p.getProductName(), p.getQuantity(), p.getUnitPrice(), p.getStatus());
//        list.add(p1);
//        list.remove(p);
//        System.out.println("Success");
    }
    public void updateInList(Product p){
        Product p1 = updateItemInfo(p);
        remove(p);
        addProductInList(p1);
   
    }

}
