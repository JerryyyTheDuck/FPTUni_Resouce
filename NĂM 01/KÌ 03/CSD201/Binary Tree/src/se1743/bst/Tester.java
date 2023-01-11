/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1743.bst;

/**
 *
 * @author BuiHung
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {5, 2, 4, 1, 9, 7, 10, 12, 5, 14, 20};
        BST<Integer> bst = new BST();
        for (int i = 0; i < a.length; i++) {
            bst.add(a[i]);
        }
        System.out.println("LNR");
        bst.LNR(bst.root);
        System.out.println("");

        System.out.println("LRN");
        bst.LRN(bst.root);
        System.out.println("");

        System.out.println("NLR");
        bst.NLR(bst.root);
        System.out.println("");

        System.out.println("So node leaf la:" + bst.countLeaf(bst.root));
        System.out.println("So node co 1 con la: " + bst.countOneChild(bst.root));
        System.out.println("So node co 2 con la: " + bst.countTwoChild(bst.root));
        System.out.println("Tree height la: " + bst.treeHeight(bst.root));

        bst.printLevel();
        System.out.println(bst.leftMostRoot(bst.root));
    }

}
