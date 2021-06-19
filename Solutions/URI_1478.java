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
public class URI_1478 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int value;

        while ((number = read.nextInt()) != 0) {
            for (int row = 1; row <= number; row++) {
                value = row;
                for (int col = 1; col <= number; col++) {
                    if (row == col) {
                        value = 1;

                    }
                    System.out.printf("%3d", value);
                    if(col < number){
                        System.out.print(" ");
                    }
                    if (col >= row) {
                        value++;
                    } else {
                        value--;
                    }

                }
                System.out.println("");
            }
            System.out.println("");
        }

    }

}
