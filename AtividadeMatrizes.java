/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadematrizes;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class AtividadeMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int Vetor[] = new int[20];
        int contador = 0;

        for (int i = 0; i < Vetor.length; i++) {

            System.out.println("Digite o " +(i+1)+"Numero: ");
            System.out.println("");
            Vetor[i]= sc.nextInt();

            if (Vetor[i] % 2 == 0) {

                contador++;
            }

        }
        System.out.println("Quantidade de numeros pares: " + contador);
    }

}
