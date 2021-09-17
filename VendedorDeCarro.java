import javax.swing.JOptionPane;

public class VendedorDeCarro {
    public static void main(String[] args){
        int numeroCarros = Integer.parseInt(JOptionPane.showInputDialog("digite o número de carros vendidos"));
        int salarioFixo = Integer.parseInt(JOptionPane.showInputDialog("digite o salário fixo"));
        double valorTotalVendas= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de vendas"));
        int valorPorCarroVend =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por carro vendido"));
        double valorCincoPorcento = valorTotalVendas *0.05;
        double total;
        total =salarioFixo+ (numeroCarros*valorPorCarroVend)+ valorCincoPorcento;
        JOptionPane.showMessageDialog(null,"O salário total é: " + total);
    }
    
}
