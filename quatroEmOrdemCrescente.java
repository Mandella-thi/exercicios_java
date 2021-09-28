import javax.swing.JOptionPane;
/*16. Fazer um programa que recebe três números inteiros em ordem 
crescente e um quarto número também inteiro que 
não siga esta regra. Mostra, em seguida, os quatro números em ordem  crescente. */

public class quatroEmOrdemCrescente {
    public static void main(String [] args){
        double num1, num2, num3, num4;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número em ordem crescente:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número em ordem crescente:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número em ordem crescente:"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número em ordem crescente:"));
   
        if(num4<=num1){JOptionPane.showMessageDialog(null,"A  ordem crescente é: " + num4 +" "+num1 +" "+num2+ " "+num3);
        }else if (num4>num1 && num4<=num2){JOptionPane.showMessageDialog(null,"A  ordem crescente é: " + num1 +" "+num4 +" "+num2+ " "+num3);
}       else if (num4>num2 && num4<=num3){JOptionPane.showMessageDialog(null,"A  ordem crescente é: " + num1 +" "+num2 +" "+ num4 + " "+num3);}
        else {JOptionPane.showMessageDialog(null,"A  ordem crescente é: " + num1 +" "+num2 +" "+num3+ " "+num4);}
}
    
}
