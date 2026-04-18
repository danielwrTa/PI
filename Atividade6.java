/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * psvm
 *
 * @author danie
 */
public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas (N): ");
        int n = sc.nextInt();
        System.out.print("Colunas (M): ");
        int m = sc.nextInt();

        int[][] f = new int[n][m];
        int contP = 0, contI = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Valor [%d][%d]: ", i, j);
                f[i][j] = sc.nextInt();
                if (f[i][j] % 2 == 0) {

                    contP++;

                } else {

                    contI++;

                }
            }
        }

        int[] par = new int[contP];
        int[] impar = new int[contI];
        int p = 0, im = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (f[i][j] % 2 == 0) {

                    par[p++] = f[i][j];
                } else {

                    impar[im++] = f[i][j];

                }
            }
        }
        System.out.println("Pares: " + Arrays.toString(par));
        System.out.println("Ímpares: " + Arrays.toString(impar));
    }
}
