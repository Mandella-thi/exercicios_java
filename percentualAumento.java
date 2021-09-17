import javax.swing.JOptionPane;

public class percentualAumento {
    public static void main(String [] args){
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário:"));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento:"));
        double bonus = salarioBase*(percentual/100);
        JOptionPane.showMessageDialog(null,"o aumento é de "+ bonus +" E o salário final é:" +(bonus +salarioBase));
    }
    
}
