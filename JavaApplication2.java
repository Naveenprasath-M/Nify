/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s1;
        Scanner s= new Scanner(System.in);
        s1=s.nextLine();
        String rev= new StringBuffer(s1).reverse().toString();
        System.out.println(rev);
    }
}
