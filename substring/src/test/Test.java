/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s1 = new Scanner(System.in);
        String str;

        System.out.print("Enter Ali's birthdate :");
        str = s1.next();

        if (str.substring(0, 2).equals("09") && str.substring(3, 5).equals("05") && str.substring(6, 10).equals("1997")) {
            System.out.println("Ali's Birthday");
        } else {
            System.out.println("Ordnary day");
        }

    }

}
