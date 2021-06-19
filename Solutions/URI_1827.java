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
public class URI_1827 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N, div;
        int M[][];
        
        while(read.hasNext()){
         N = read.nextInt();
         M = new int[N][N];
         div = N/3;
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    if(row==col){M[row][col] = 2;}
                    if(row+col == N-1){M[row][col] = 3;}
                    if(row >= div && row < N-div && col >= div && col < N-div){M[row][col] = 1;}
                    if(N%2!=0 && col == (N-1)/2 && row == (N-1)/2){M[row][col] = 4;}
                }
            }
            //print
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(M[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }

}