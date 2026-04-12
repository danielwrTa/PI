/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadematrizes;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];
        int numPares[] = new int[5];
        int numImpares[] = new int[5];

        int Par = 0;
        int Impar = 0;

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Numero " + (i + 1) + " :");
            numeros[i] = sc.nextInt();

            if (i % 2 == 0) {
                
                numPares[Par] = numeros[i];
                Par++;
                
            } else {
                
                numImpares[Impar] = numeros[i];
                Impar++;
                
            }
        }

        System.out.println("Valores nas posicoes pares: ");
        for (int j = 0; j < 5; j++) {
            
            System.out.print(numPares[j] + " ");
        }

        System.out.println("Valores nas posicoes impares: ");
        for (int j = 0; j < 5; j++) {
            
            System.out.println(numImpares[j] + " ");
            
        }
    }
}
