
package Estrutura_de_Repeticao;

import java.util.Scanner;

public class Atividade05_Desconto{

   
    public static void main(String[] args) {
        
        double valorProduto,desconto;
        String nomeProduto; 
        int contador;
        
        Scanner ler = new Scanner(System.in);
        
        for(contador =1; contador<=10; contador++){
            
            System.out.print("Escreva o nome do produto " + contador +" : ");
            nomeProduto = ler.next();
            System.out.print("Escreva o valor do produto " + contador +" : ");
            valorProduto = ler.nextDouble(); 
            
            desconto = valorProduto*0.5;
            
            System.out.println("O nome do produto "+contador
                    +" é " +nomeProduto+ " e o valor dele com 50% de deconto é " +desconto);
            
        }
    }
    
}
