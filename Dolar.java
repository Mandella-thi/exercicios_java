import javax.swing.JOptionPane;

public class Dolar {
    public static void main(String [] arg){
        Double cotacao = Double.parseDouble(JOptionPane.showInputDialog("digite a cotação do dolar"));
        Double quantidade = Double.parseDouble(JOptionPane.showInputDialog("digite a quantoidade de dolar"));
        Double quantreal = cotacao*quantidade;
        JOptionPane.showMessageDialog(null,"Em reais essa quantidade de dolar é: " + quantreal);
    }
}
