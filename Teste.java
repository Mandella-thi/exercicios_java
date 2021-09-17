import javax.swing.JOptionPane;

public class Teste{
    public static void main(String[] args){
        System.out.println("hello world");
        String nome =JOptionPane.showInputDialog("digite seu nome");
        JOptionPane.showMessageDialog(null, "o nome digitado foi:" + nome);
    }
}