import javax.swing.JOptionPane;

public class anoBissexto {
    public static void main(String [] args){
        int ano;
        ano= Integer.parseInt(JOptionPane.showInputDialog("Digite um ano para saber se é bissexto:"));
        if( ano%400==0 || ((ano%4==0) && (ano% 100 !=0))){
            JOptionPane.showMessageDialog(null,"O ano é bissexto:");
        } else {JOptionPane.showMessageDialog(null," o ano não é bissexto:");}
    }
    
}
