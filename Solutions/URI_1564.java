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
public class URI_1564 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N;
        
        while (read.hasNext()) {            
            N = read.nextInt();
            
            if(N==0){System.out.println("vai ter copa!");}
            else{System.out.println("vai ter duas!");}
        }
    }
    
}
