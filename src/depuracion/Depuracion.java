/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package depuracion;

import java.util.Scanner;

/**
 *
 * @author ncelis
 */
public class Depuracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca lado del cuadrado: ");
        n = sc.nextInt();
        cuadrado(n);

    }

    public static void cuadrado(int lado) {
        int n = lado;

        for (int cont = 0; n > cont; cont++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int cont = 1; (n - 2) >= cont; cont++) {
            System.out.print("*");

            for (int i = 0; (n - 2) > i; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        for (int cont = 0; n > cont; cont++) {
            System.out.print("*");
        }
    }
}
