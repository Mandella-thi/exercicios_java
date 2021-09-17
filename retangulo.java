import javax.swing.JOptionPane;

public class retangulo {
    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("digite a alura do retângulo:"));
        int base = Integer.parseInt(JOptionPane.showInputDialog("digite a base do retângulo:"));
        int areaRet = base*altura;
        JOptionPane.showMessageDialog(null,"a área do retângulo é:" + areaRet);
    }
    
}
