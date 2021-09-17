import javax.swing.JOptionPane;

public class idadeEmDias { public static void main(String[] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    int dias =365*idade;
    JOptionPane.showMessageDialog(null,"Sua idade em dias é:" + dias); 
}
    
}
