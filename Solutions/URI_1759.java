/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class URI_1759 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();

        while (N-- > 0) {
            System.out.print("Ho");
            if (N > 0) {
                System.out.print(" ");
            }
        }
        System.out.println("!");
    }
}
