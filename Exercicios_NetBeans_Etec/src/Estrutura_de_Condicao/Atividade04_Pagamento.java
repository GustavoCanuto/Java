package Estrutura_de_Selecao;

import javax.swing.JOptionPane;

public class Atividade04_Pagamento{

    public static void main(String[] args) {
        // TODO code application logic here
        int finalPlaca;

        finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                + "numero final da Placa do carro"));
        
        switch(finalPlaca){
            
            case 1:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/05");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/11");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "o valor digitado está incorreto.");
                break;
        }

    }
}
