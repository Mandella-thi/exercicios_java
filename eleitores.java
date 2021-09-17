import javax.swing.JOptionPane;

public class eleitores {
    public static void main(String [] args){
        double eleitores, votosValidos, votosBrancos, votosNulos;
        eleitores= Double.parseDouble(JOptionPane.showInputDialog("digite o numero de eleitores: "));
        votosValidos =Double.parseDouble(JOptionPane.showInputDialog("digite os votos validos: "));
        votosBrancos =Double.parseDouble(JOptionPane.showInputDialog("digite os votos brancos: "));
        votosNulos =Double.parseDouble(JOptionPane.showInputDialog("digite os votos nulos: "));
        double validos =(votosValidos/eleitores)*100;
        double brancos =(votosBrancos/eleitores)*100;
        double nulos = (votosNulos/eleitores)*100;
        JOptionPane.showMessageDialog(null,"O percentual de votos validos é: "+ validos +"%" +"O percentual de votos brancos é: " + brancos + "%" + "o percentual de votos nulos é de:" + nulos +"%");
    }
    
}
