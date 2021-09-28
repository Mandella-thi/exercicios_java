import javax.swing.JOptionPane;
/*19.  Ler  um  número  inteiro  e  exibir  o  seu  antecessor  e  o  seu  sucessor. */

public class antecessorSucessor {
    public static void main(String [] args){
        int num;
        
        num= Integer.parseInt(JOptionPane.showInputDialog("Dinite um número"));
        int antnum =num -1;
        int susnum = num +1;
        JOptionPane.showMessageDialog(null," O antecessor é: " + antnum);
        JOptionPane.showMessageDialog(null,"O sucessor é: "+  susnum);
    }
    
}
