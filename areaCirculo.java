import javax.swing.JOptionPane;

public class areaCirculo {
    public static void main(String [] args){
        int raio =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio:"));
        double pi = 3.14;
        JOptionPane.showMessageDialog(null,"A área da circunferencia é:" + (pi* raio*raio));
    }
    
}
