/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class interfacee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in;
        boolean kon = true;
        BinaryTree bt = new BinaryTree();
//        BinaryTreeNode deleted;

        do {
            System.out.println("\t\t>>+ BinaryTree +<<");
            System.out.println("___________________________________________");
            System.out.println("|1. Print\t |2. Push\t |3. Delete |");
            System.out.println("|4. Infix\t |5. Prefix\t |6. Postfix |");
            System.out.println("|7. Keluar>>");
            System.out.print("Masukkan Pilihan: ");
            int pilih = input.nextInt();
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.println("\t\t>> Print <<\n");
                    bt.print();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\t\t>> Push <<\n");
                    System.out.print("Input Nilai: ");
                    in = input.nextInt();
                    System.out.println("");
                    bt.push(new BinaryTreeNode(in));
                    break;
                case 3:
                    System.out.println("\t\t>> Delete <<\n");
                    System.out.println("|1. Delete root");
                    System.out.println("|2. Delete kanan root");
                    System.out.println("|3. Delete kiri root");
                    System.out.println("|4. Delete angka paling kanan");
                    System.out.println("|5. Delete angka paling kiri");
                    System.out.print("Masukkan pilihan: ");
                    int del = input.nextInt();
                    switch (del) {
                        case 1:
                            BinaryTreeNode deleted = bt.root;
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            break;
                        case 2:
                            deleted = bt.root.right;
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            break;
                        case 3:
                            deleted = bt.root.left;
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            break;
                        case 4:
                            deleted = bt.root.most_right_child();
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            break;
                        case 5:
                            deleted = bt.root.most_left_child();
                            System.out.println(deleted.data);
                            bt.delete(deleted);
                            break;
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\t\t>> Infix <<\n");
                    bt.infix();
                    break;
                case 5:
                    System.out.println("\t\t>> Prefix <<\n");
                    bt.prefix();
                    break;
                case 6:
                    System.out.println("\t\t>> Postfix <<\n");
                    bt.postfix();
                    break;
                case 7:
                    kon = false;
                    break;
            }
        } while (kon == true);
    }
}
