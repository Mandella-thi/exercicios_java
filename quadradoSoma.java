import javax.swing.JOptionPane;

public class quadradoSoma {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo número"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro número"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("digite o quarto número"));
        int soma = ((n1*n1)+(n2*n2)+(n3*n3)+(n4*n4));
        JOptionPane.showMessageDialog(null,soma);
        
    }
    
}
