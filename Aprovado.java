import javax.swing.JOptionPane;

public class Aprovado {
    public static void main (String [] args){
        int notaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno"));
        int percentualFaltas= Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de faltas"));
        if (notaFinal>=70 && percentualFaltas<25){
            JOptionPane.showMessageDialog(null,"você foi aprovado.");

        }else{
            if(notaFinal>40 && percentualFaltas<25){
                JOptionPane.showMessageDialog(null,"Ficou de exame.");
            }else{
                JOptionPane.showMessageDialog(null,"Você foi reprovado.");
            }
        }

        
    }
    
}
