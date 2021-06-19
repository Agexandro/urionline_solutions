/*
 * To change this license header, choose License Headers in Procolumnaect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.util.Scanner;


/**
 *
 * @author alex
 */
public class SquareMatrixI {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size;

        while (read.hasNext()) {
            size = read.nextInt();

            for (int fila = 1; fila <= size; fila++) {
                for (int columna = 1; columna <= size; columna++) {

                    if (fila + columna == size + 1) { System.out.print(2);} 
                    
                    else {
                        
                        if (fila == columna) { System.out.print(1);} 
    
                        else { System.out.print(3); }
                        
                    }
                }
                System.out.println("");

            }
        }
    }

}
