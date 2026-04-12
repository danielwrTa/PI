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
public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares[] = new int[5];
        int impares[] = new int[5];
        int paresCheios = 0;
        int imparesCheios = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                pares[paresCheios] = valor;
                paresCheios++;

                if (paresCheios == 5) {
                    System.out.print("Vetor de pares cheio: ");
                    
                    for (int j = 0; j < 5; j++) {
                        System.out.print(pares[j] + " ");
                    }
                    System.out.println();
                    paresCheios = 0;
                }
            } else {
                impares[imparesCheios] = valor;
                imparesCheios++;

                if (imparesCheios == 5) {
                    System.out.print("Vetor de impares cheio: ");
                    
                    for (int j = 0; j < 5; j++) {
                        System.out.print(impares[j] + " \n");
                    }
                    
                    imparesCheios = 0;
                }
            }
        }

        if (paresCheios > 0) {
            System.out.print("Resto dos pares: ");
            for (int j = 0; j < paresCheios; j++) {
                System.out.print(pares[j] + " ");
            }
            System.out.println();
        }

        if (imparesCheios > 0) {
            System.out.print("Resto dos impares: ");
            for (int j = 0; j < imparesCheios; j++) {
                System.out.print(impares[j] + " ");
            }
            System.out.println();
        }

    }

}
