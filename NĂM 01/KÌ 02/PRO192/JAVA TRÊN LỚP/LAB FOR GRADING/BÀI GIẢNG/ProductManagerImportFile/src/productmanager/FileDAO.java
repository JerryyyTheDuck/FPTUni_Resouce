/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanager;

import java.io.*;
import java.util.*;

/**
 *
 * @author green
 */
public class FileDAO {

    public static ArrayList<Product> loadData(String filename) throws Exception {
        File temp = new File(filename);
        if(!temp.exists() || !temp.isFile()){
            return null;
        }
        
        
        FileReader f = new FileReader(filename);
        BufferedReader bf = new BufferedReader(f);

        //mo file
        //doc file
        ArrayList<Product> list = new ArrayList();
        while (bf.ready()) {
            String s = bf.readLine();
            String[] arr = s.split(",");
            if (arr.length == 4) {
                
                Product p = new Product(Integer.parseInt(arr[0].trim()), arr[1], Integer.parseInt(arr[2].trim()), arr[3]);
                list.add(p);
            }
        }
        //dong file
        f.close();
        bf.close();
        return list;
    }

    //ham nay de ghi list cac product vao file
//    public static void writeData(String filename, ArrayList<Product> list) throws Exception {
//        File tmp = new File(filename);
//        if(!tmp.exists() || !tmp.isFile()){
//            return;
//        }
//        if (list != null && list.size() > 0) {
//            PrintWriter w = new PrintWriter(filename);
//            for (Product product : list) {
//                w.println(product.toString());
//            }
//           w.close();
//        }
//    }
    
    public static void writeData(String filename, Product p) throws Exception {
        File tmp = new File(filename);
        if(!tmp.exists() || !tmp.isFile()) return;
        FileOutputStream f = new FileOutputStream(filename,true);
        OutputStreamWriter w = new OutputStreamWriter(f);
        w.write(p.toString());
        w.close();
        f.close();
    
    }
}
