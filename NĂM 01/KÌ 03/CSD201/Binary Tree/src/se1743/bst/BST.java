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
public class BST<T extends Comparable<T>> {

    Node<T> root;

    public BST() {
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(T el) {
        Node<T> p = new Node(el);
        if (isEmpty()) {
            root = p;
        } else {
            Node<T> tmp = root;
            Node<T> pre = null;
            while (tmp != null) {
                pre = tmp;
                if (el.compareTo(tmp.val) == 1) {
                    tmp = tmp.right;
                } else {
                    tmp = tmp.left;
                }
            }
            if (el.compareTo(pre.val) == 1) {
                pre.right = p;
            } else {
                pre.left = p;
            }
        }
    }

    void NLR(Node<T> p) {
        if (p != null) {
            System.out.print(p.val + " ");
            NLR(p.left);
            NLR(p.right);
        }
    }

    void LRN(Node<T> p) {
        if (p != null) {
            LRN(p.left);
            LRN(p.right);
            System.out.print(p.val + " ");
        }
    }

    void LNR(Node<T> p) {
        if (p != null) {
            LNR(p.left);
            System.out.print(p.val + " ");
            LNR(p.right);
        }
    }

    int countLeaf(Node<T> p) {
        if (p != null) {
            if (p.left == null && p.right == null) {
                System.out.println(p.val + " ");
                return 1;
            } else {
                return countLeaf(p.left) + countLeaf(p.right);
            }
        }
        return 0;
    }

    int countOneChild(Node<T> p) {
        if (p != null) {
            if (p.left != null && p.right == null) {
                return 1 + countOneChild(p.left) + countOneChild(p.right);
            }
            if (p.left == null && p.right != null) {
                return 1 + countOneChild(p.left) + countOneChild(p.right);
            } else {
                return countOneChild(p.left) + countOneChild(p.right);
            }
        }
        return 0;
    }

    int countTwoChild(Node<T> p) {
        if (p != null) {
            if (p.left != null && p.right != null) {
                return 1 + countTwoChild(p.left) + countTwoChild(p.right);
            } else {
                return countTwoChild(p.left) + countTwoChild(p.right);
            }
        }
        return 0;
    }

    int treeHeight(Node<T> p) {
        if (p != null) {
            int left = treeHeight(p.left);
            int right = treeHeight(p.right);
            if (left < right) {
                return right + 1;
            } else {
                return left + 1;
            }
        }
        return 0;
    }

    void printNodeByLevel(Node<T> p, int length) {
        if (p != null) {
            if (length == 1) {
                System.out.print(p.val + " ");
            } else {
                printNodeByLevel(p.left, length - 1);
                printNodeByLevel(p.right, length - 1);
            }
        }
    }

    void printLevel() {
        for (int i = 1; i < treeHeight(root); i++) {
            System.out.print("level " + i + ": ");
            printNodeByLevel(root, i);
            System.out.println("");
        }
    }
    Node<T> leftMostRoot(Node<T> p){
        if(p.right != null){
            return leftMostRoot(p.right.left);
        }
        return null;
    }

}
