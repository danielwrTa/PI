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
public class atividade9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        int contadorB = 0;

        System.out.println("Digite os 100 valores do vetor A:");
        
        for (int i = 0; i < 100; i++) {
            
            a[i] = sc.nextInt();
            
        }

        for (int i = 0; i < 100; i++) {
            
            if (a[i] > 0) {
                
                b[contadorB] = a[i];
                contadorB++;
                
            }
        }

        System.out.println("Vetor B compactado:");
        for (int i = 0; i < contadorB; i++) {
            
            System.out.println(b[i]);
            
        }
    }
}
