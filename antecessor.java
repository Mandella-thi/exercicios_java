import javax.swing.JOptionPane;

public class antecessor {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
        int antece = num -1;
        JOptionPane.showMessageDialog(null,"o antecessor do número é: " + antece);
    }
    
}
