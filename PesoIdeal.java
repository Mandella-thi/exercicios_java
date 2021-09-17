import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String [] args){
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        String sexo =JOptionPane.showInputDialog("Digite m para masculino ou f para feminino");
        if (sexo== "m"){JOptionPane.showMessageDialog(null," O peso ideal é: " + ((altura*72.7)-58));
    } else{
        JOptionPane.showMessageDialog(null,"O peso ideal feminino é: " + ((62.1*altura)-44.7));
    }
    }
    
}
