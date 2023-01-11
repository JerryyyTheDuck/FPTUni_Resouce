/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanager;

import java.util.*;
/**
 *
 * @author green
 */
//class nay dung chua object product trong array
public class ProductList {
    private ArrayList<Product> list;
    final String filename = "data2.csv";
    public ProductList(){
        //list = new ArrayList<>(); kieu cu
        try {
            list = FileDAO.loadData(filename);
            
        } catch (Exception e) {
            e.printStackTrace(); //in ra loi~ gì
        }
    }
    
    public void displayProducts(){
        for (Product product : list) {
            System.out.println(product);
        }
    }
    
    //ham nay de them moi mot san pham vao array list cac product
    public boolean addProduct(Product p){
        list.add(p);
        //back up ghi list vao file
        try {
//            FileDAO.writeData(filename, list);
        FileDAO.writeData(filename, p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
