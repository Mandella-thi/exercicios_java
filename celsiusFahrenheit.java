import javax.swing.JOptionPane;

/*17. Ler uma temperatura em graus Celsius e apresentá-la 
convertida em graus Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, 
sendo F a temperatura em Fahrenheit e C a temperatura  em  Celsius. */

public class celsiusFahrenheit{
    public static void main(String [] args){
        double celsius;
        double fahrenheit;
        celsius= Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em celsius:"));
        fahrenheit = (celsius * (9.0/5.0)) +32.0;
        JOptionPane.showMessageDialog(null,"A temperatura convertida em Fahrenheit é: " + fahrenheit);

    }
}