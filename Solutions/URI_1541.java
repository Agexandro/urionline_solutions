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
public class URI_1541 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float A, B, C;
        
        while ((A = read.nextFloat()) != 0) {
            B = read.nextFloat();
            C = read.nextFloat();
            int areaUtilizable =(int) Math.sqrt((((A*B)/C)*100));
            System.out.println(areaUtilizable);
        }
    }

}
