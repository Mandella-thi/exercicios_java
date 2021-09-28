import javax.swing.JOptionPane;

public class diasSemana {
    public static void main(String [] args){
        String diasSem[];
        int cursor;
        diasSem= new String[7];
        diasSem[0] = "Domingo";
        diasSem[1]= "Segunda";
        diasSem[2]= "Terça";
        diasSem[3]= "Quarta";
        diasSem[4] ="Quinta";
        diasSem[5] = "Sexta";
        diasSem[6] ="Sábado";
        cursor =Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7"));
        JOptionPane.showMessageDialog(null,"O dia da semana escolhido é: " + diasSem[cursor -1]);
    }
    
}
