import javax.swing.JOptionPane;

public class somaTresNumeros {
    public static void main( String[] args){
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int num3= Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        JOptionPane.showMessageDialog(null,"A soma dos 3 números é: " + (num1 +num2 +num3));
        }
    
}
