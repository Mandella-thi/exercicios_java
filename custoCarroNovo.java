import javax.swing.JOptionPane;

public class custoCarroNovo {
    public static void main(String[] args){
        double precoFab = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de fábrica do veículo: "));
        double precoVenda =precoFab +(precoFab*0.28) +(precoFab*0.45);
        JOptionPane.showMessageDialog(null,"O preço final é de:" +precoVenda);
    }
    
}
