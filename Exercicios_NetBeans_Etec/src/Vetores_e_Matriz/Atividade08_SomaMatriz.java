package Vetores_e_Matriz;

import javax.swing.JOptionPane;

public class Atividade08_SomaMatriz{

    public static void main(String[] args) {
        
     try{
        int dados[][] = new int[5][5];
        int linha, coluna, soma=0;
        
        JOptionPane.showMessageDialog(null,"Inserindo os dados na Matriz");
        
        for(linha =0; linha<5; linha++){
            
            for(coluna = 0 ; coluna<5; coluna++){
                 dados[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero Inteiro"+"\nlinha: "+linha+"\ncoluna: "+coluna));
                
            }
        }
        
        for(linha=0; linha<5; linha++){
            
            for(coluna=0; coluna<5; coluna++){
                
               soma = soma + dados[linha][coluna];
            }
        
        
    }
         JOptionPane.showMessageDialog(null,"A soma dos elementos da Matriz é: "+soma);
   }catch (NumberFormatException e){
     JOptionPane.showMessageDialog(null,"Entre somente com números inteiros\nEncerrando","ERRO",JOptionPane.ERROR_MESSAGE);
   }
   
}
}