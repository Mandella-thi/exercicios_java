import javax.swing.JOptionPane;

public class MaiorEntreDois {
    public static void main(String[] args){
        double num1, num2;
        num1 =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número:"));
        num2 =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número:"));
        if (num1> num2){JOptionPane.showMessageDialog(null,"O maior número é: " + num1);}
        else{JOptionPane.showMessageDialog(null,"O maior número é: " + num2);}
    }
    
}
