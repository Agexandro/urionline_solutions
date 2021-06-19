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
public class URI_1589 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int T, R1, R2;
        T = read.nextInt();
        while (T > 0) {
            R1 = read.nextInt();
            R2 = read.nextInt();

            int cable = R1+R2;
            System.out.println(cable);
            T--;
        }
    }

}
