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
public class URI_1557 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N, T;
        int value;
        int temp;
        int[][] M;

        while ((N = read.nextInt()) != 0) {
            value = 1;
            M = new int[N][N];
            for (int row = 0; row < N; row++) {
                temp = value;
                for (int col = 0; col < N; col++) {
                    if (col == 0) {
                        M[row][col] = value;
                    } else {
                        temp = temp * 2;
                        M[row][col] = temp;
                    }
                }
                value *= 2;
            }
            T = String.valueOf((M[N - 1][N - 1])).length();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%" + T + "d", M[i][j]);
                    if (j < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");

        }
    }

}
