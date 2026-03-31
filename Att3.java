/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att3;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Att3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nome;
        int repeticao;
        
        
        System.out.println("Digite a quantidade de vezes que vc quer que seu nome apareça: ");
        repeticao = sc.nextInt();
        System.out.println("Qual seu nome: ");
        nome = sc.next();
        
        while(repeticao >0 ){
        
            System.out.println(nome);
            repeticao --;
            
        }
    }
    
}
