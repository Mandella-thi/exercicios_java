import javax.swing.JOptionPane;

public class numerosEntreCemEDuzentos {
    public static void main(String[] args){
        int op =1;
        int numero;
        int contador=0;

        while(op!= 0){
            numero =Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            if(numero>=100 && numero<=200){contador ++;
            JOptionPane.showMessageDialog(null,"Os números entre 100 e 200 são: "+ contador);}
            else{JOptionPane.showMessageDialog(null,"Os números entre 100 e 200 são: "+ contador);}
            op=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor diferente de zero para continuar"));}
        }
    }
    

