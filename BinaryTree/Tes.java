/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author ASUS
 */
public class Tes {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.print();
        bt.push(new BinaryTreeNode(20));
        bt.push(new BinaryTreeNode(15));
        bt.push(new BinaryTreeNode(25));
        bt.push(new BinaryTreeNode(12));
        bt.push(new BinaryTreeNode(17));
        bt.push(new BinaryTreeNode(22));
        bt.push(new BinaryTreeNode(27));
        bt.push(new BinaryTreeNode(28));
        bt.print();
        bt.infix();
        bt.prefix();
        bt.postfix();

        BinaryTreeNode deleted = bt.root.most_left_child();
        System.out.println(deleted.data);
        bt.delete(deleted);
        bt.print();

        deleted = bt.root.most_right_child().parent;
        System.out.println(deleted.data);
        System.out.println(deleted.only_has_right());
        System.out.println(deleted.only_has_left());
        bt.delete(deleted);
        bt.print();
        deleted = bt.root;
        System.out.println(deleted.data);
        bt.delete(deleted);
        bt.print();
    }
}
