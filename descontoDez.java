import javax.swing.JOptionPane;

public class descontoDez {
    public static void main(String [] args){
        double preco =Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        JOptionPane.showMessageDialog(null,"Com o desconto o valor do produto será:" + (preco*0.9));
    }
    
}
