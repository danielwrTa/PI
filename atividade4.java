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
public class atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInvertido[] = new int[20];

        for (int i = 0; i < 20; i++) {

            System.out.println("Digite o " + (i + 1) + " numero: ");
            valorInvertido[i] = sc.nextInt();

        }
        System.out.println("Numeros Invertidos");
        for (int i = 19; i >= 0; i--) {
            
            System.out.println("Posicao" + i + " numero: " + valorInvertido[i]);

        }
        System.out.println("Numeros Direitos");
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Posicao" + i + " numero: " + valorInvertido[i]);
        }
    }
}
