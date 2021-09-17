import javax.swing.JOptionPane;

public class salarioReajuste {
    public static void main(String[] args){
        double salario= Double.parseDouble(JOptionPane.showInputDialog("digite o salário:"));
        double reajuste= Double.parseDouble(JOptionPane.showInputDialog("digite o percentual de reajuste"));
        double reajustePercentual =reajuste/100;
        double novoSalario = salario +(salario* reajustePercentual);
        JOptionPane.showMessageDialog(null,"o novo salário é de: " + novoSalario);
    }
    
}
