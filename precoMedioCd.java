import javax.swing.JOptionPane;

public class precoMedioCd {
    public static void main(String [] args){
        double precoUni;
        double totalCds;
        int numCds;
        totalCds=0;
        int cont;
        cont =1;
        numCds =Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de cds"));
        while( cont<= numCds){
            precoUni =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cd"+ cont));
            totalCds =totalCds+ precoUni;
            cont++;
        }
        JOptionPane.showMessageDialog(null,"O valor da coleção é: " +totalCds+ " e o preço medio do cd é: " +(totalCds/numCds));
    }
    
}
