/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] m = new int[n][n];
        int somaLinha3 = 0;
        int somaCol4 = 0;
        int somaDiagPrincipal = 0;
        int somaDiagSecundaria = 0;
        int somaTotal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                m[i][j] = sc.nextInt();

                if (i == 2) {
                    somaLinha3 += m[i][j];
                }

                if (j == 3) {

                    somaCol4 += m[i][j];

                }

                if (i == j) {

                    somaDiagPrincipal += m[i][j];

                }

                if (i + j == n - 1) {

                    somaDiagSecundaria += m[i][j];

                }

                somaTotal += m[i][j];

            }
        }
        System.out.println("\n--- RESULTADOS QUESTÃO 3 ---");
        System.out.println("a) Soma da linha 3: " + somaLinha3);
        System.out.println("b) Soma da coluna 4: " + somaCol4);
        System.out.println("c) Soma da diagonal principal: " + somaDiagPrincipal);
        System.out.println("d) Soma da diagonal secundária: " + somaDiagSecundaria);
        System.out.println("e) Soma de toda a matriz: " + somaTotal);
    }

}
