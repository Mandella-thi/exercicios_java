import javax.swing.JOptionPane;

public class mediaComPesos {
    public static void main(String[] args){
    double traLab =Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho de laboratório:"));
    double avaSemes = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da avaliação semestral:"));
    double exaFinal =Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Exame final:"));
    JOptionPane.showMessageDialog(null,"A média do aluno é: " +(((traLab*2)+(avaSemes*3)+(exaFinal*5))/10));
    }
}
