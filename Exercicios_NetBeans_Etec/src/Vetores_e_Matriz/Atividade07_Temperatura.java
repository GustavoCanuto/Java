package Vetores_e_Matriz;

import javax.swing.JOptionPane;

public class Atividade07_Temperatura{


    public static void main(String[] args) {
        
        double temperatura[] = new double[7];
        double media = 0;
        double maior = 0; 
        double menor =0;
        int i;
        String mensagem="";
        /*
        Ler as temperaturas m�dias de uma semana 
        as apresentar� no final do processamento 
        juntamente com a maior e menor temperatura
        bem como a temperatura m�dia da semana.
        */
     for (i=0; i<7; i++){
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digita a "+(i+1)+
                    "� temperatura em graus:"));
            
              // Inicializa a vari�vel menor com o valor da primeira temperatura
            if (i == 0) {
                menor = temperatura[i];
            }
            
            // Calcula a m�dia
            media += temperatura[i];
            
            // Verifica se � a maior temperatura
            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
            
            // Verifica se � a menor temperatura
            if (temperatura[i] < menor) {
                menor = temperatura[i];
                
        }
     }
        // Calcula a m�dia
        media = media / 7;
        
        for (i = 0; i<7; i++){
            
            mensagem += " A temperatura do "+(i+1)+"�Dia �: "+temperatura[i]+" �C \n";
            
    }
        
        mensagem += "A maior temperatura �: "+maior+"\n";
        mensagem += "A menor temperatura �: "+menor+"\n";
        mensagem += "A temperatura m�dia da semana �: "+media;
        
    JOptionPane.showMessageDialog(null, mensagem);
}

}