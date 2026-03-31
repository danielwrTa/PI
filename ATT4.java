/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att4;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class ATT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int fatorial, resultado;
        resultado = 1;
        System.out.println("Digite o fatorial desejado: ");
        fatorial = sc.nextInt();
        
        while (fatorial >0) {
           
            resultado = resultado * fatorial ;
            fatorial--;
            
            System.out.println("O valor do fatorial  e "+resultado);
            
        }
    }
    
}
