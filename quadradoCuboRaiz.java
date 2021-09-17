import javax.swing.JOptionPane;

public class quadradoCuboRaiz {
    public static void main(String [] args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número para calcular o quadrado, o cubo e a raiz quadrada:"));
        System.out.println(" O quadrado é:" + (num*num) + "o cubo é: " + (num*num*num) +"e a raiz quadrada é: " + Math.sqrt(num));
    }
    
}
