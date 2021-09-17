import javax.swing.JOptionPane;

public class comissaoVendedor {
    public static void main(String[] args) {
        Double peca = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da peça"));
        Double quantipeca =Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade de peças"));
        Double total = peca*quantipeca;
        Double comissao = total*0.05;
        JOptionPane.showMessageDialog(null,"a comissão é de:" + comissao);

        
    }
    
}
