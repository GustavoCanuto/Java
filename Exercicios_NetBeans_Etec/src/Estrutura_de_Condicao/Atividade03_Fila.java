
package Estrutura_de_Selecao;

import javax.swing.JOptionPane;

public class Atividade03_Fila{

    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua idade"));
        
        if(idade<60){
            JOptionPane.showMessageDialog(null,"Utilize a fila comum");
    }   else if (idade<=80){
            JOptionPane.showMessageDialog(null,"Utilize a fila prioritária");
    }   else{
             JOptionPane.showMessageDialog(null,"Utilize a fila para maiores de 80 anos");
    }
        
   }
}
    
