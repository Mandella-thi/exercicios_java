import javax.swing.JOptionPane;

public class idadeEmAnos {
    public static void main(String [] args){
        double anos = Double.parseDouble(JOptionPane.showInputDialog("digite a idade em anos"));
        double meses = Double.parseDouble(JOptionPane.showInputDialog("digite a idade em meses"));
        double dias = Double.parseDouble(JOptionPane.showInputDialog("digite idade em dias"));
        double mesesAno = meses*30;
        double anosDias = anos*365;
        double total = mesesAno +anosDias +dias;
        JOptionPane.showMessageDialog(null,"a idade em dias é: " + total);

    }
    
}
