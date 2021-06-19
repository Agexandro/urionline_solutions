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
public class URI_1789 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int L,V,level;
        
        while(read.hasNext()){
            L = read.nextInt();
            level = 0;
            while (L-->0) {                
                V = read.nextInt();
                
                if(V>level){
                    level = V;
                }
            }
            if (level<10) {System.out.println(1); }            
            if (level>=10 && level < 20) {System.out.println(2);}
            if (level>=20) {System.out.println(3);}
        }
    }

}
