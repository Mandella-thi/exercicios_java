import javax.swing.JOptionPane;

public class triangulo {
    public static void main(String[] args){
        double altura= Double.parseDouble(JOptionPane.showInputDialog("digite a altura do triângulo"));
        double base = Double.parseDouble(JOptionPane.showInputDialog("digite a base do triângulo"));
        JOptionPane.showMessageDialog(null,"A área do triângulo é: " +( altura*base/2));
    }
    
}
