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
public class URI_1828 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        String Sheldon, Raj, R;

        while (T-- > 0) {
            Sheldon = read.next();
            Raj = read.next();
            R = Sheldon + " " + Raj;
            if (Sheldon.matches(Raj)) {
                System.out.println("Caso #3: De novo!");
            } else {

                if (R.matches("tesoura papel") || R.matches("papel pedra") || R.matches("pedra lagarto")
                        || R.matches("lagarto Spock") || R.matches("Spock tesoura") || R.matches("tesoura lagarto")
                        || R.matches("lagarto papel") || R.matches("papel Spock") || R.matches("Spock pedra")
                        || R.matches("pedra tesoura")) {
                    System.out.println("Caso #1: Bazinga!");
                } else {
                    System.out.println("Caso #2: Raj trapaceou!");
                }

            }
        }

    }
}
