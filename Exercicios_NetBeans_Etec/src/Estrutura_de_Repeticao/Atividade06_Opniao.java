
package Estrutura_de_Repeticao;

import javax.swing.JOptionPane;

public class Atividade06_Opniao{

  public static void main(String[] args) {
   
      int idade;
      int lugares = 0;
      int otimo =0,ruim=0,pessimo=0;
      int mediaRuim=0,totalIdade=0, porcentagemPessimo=0;
      String nota;
      
    while(lugares<40){
          
          idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?"));
          
          nota = JOptionPane.showInputDialog(null," Informe sua opini�o em rela��o ao filme,"+
       " segundo as seguintes notas:\n" +
        "A - �timo /  B - Bom / C - Regular  / D - Ruim  / E -  P�ssimo.");
          
      while(!nota.equals("A")&&
              !nota.equals("B")&&
              !nota.equals("C")&&
              !nota.equals("D")&&
              !nota.equals("E")) {
          
       nota = JOptionPane.showInputDialog(null,"Campo incoreto, por favor informe uma das op��es:\n"+
       "A - �timo /  B - Bom / C - Regular  / D - Ruim  / E -  P�ssimo.");
         
         }
      
      if(nota.equals("A")){
       
          otimo++;  // quantidade pessoa que votou otimo
          
      }else if(nota.equals("D")){
          
          ruim++; // quantidade pessoa que votou ruim
          totalIdade += idade;
          mediaRuim = totalIdade/ruim;
                   
      }else if(nota.equals("E")){
          
          pessimo++; // quantidade pessoa que votou pessimo
          porcentagemPessimo = (pessimo*100)/40;
          
      }
          lugares++;
    }
      
      JOptionPane.showMessageDialog(null,"a quantidade de respostas �timo �: "+otimo+
      "\n a m�dia de idade das pessoas que responderam ruim �: " +mediaRuim+
       "\n a porcentagem de respostas p�ssimo �: " + porcentagemPessimo+"%");
    
  }
    
}
