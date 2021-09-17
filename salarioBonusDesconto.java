import javax.swing.JOptionPane;

public class salarioBonusDesconto {
    public static void main (String[] args){
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base:"));
        double bonus= salarioBase*0.05;
        double imposto =salarioBase*0.07;
        JOptionPane.showMessageDialog(null,"O salário será de:" + (salarioBase +bonus - imposto));
    }
    
}
