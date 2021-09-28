import javax.swing.JOptionPane;
//Entrar com vários números positivos e imprimir a média dos números digitados.



public class mediaDePositivos {
    public static void main(String[] args){
        int op, positivo, denominador, soma,media;
        op = 1;
        denominador= 0;
        soma=0;
        media=0;
        while(op!=0){
            denominador++;
            positivo =Integer.parseInt(JOptionPane.showInputDialog("digite o valor do numero a ser somado"));
            soma= soma + positivo;
            media= soma/denominador;
            JOptionPane.showMessageDialog(null,"A media dos numeros somados é: " + media);
            op=Integer.parseInt(JOptionPane.showInputDialog("digite qualquer valor diferente de zero para continuar somando a média."));

        }
    }
    
}
