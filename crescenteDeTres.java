import javax.swing.JOptionPane;

public class crescenteDeTres {
    public static void main(String [] args){
        double num1, num2, num3;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        if(num1 >= num2 && num1>=num3){if (num2>=num3){
            JOptionPane.showMessageDialog(null,"1A ordem crescente dos números é: " + num3 +" " + num2+" " + num1);
        }else{JOptionPane.showMessageDialog(null,"2A ordem crescente dos números é: " + num2+" "+ num3+" "+ num1);}


        } else if(num2>= num1 && num2>=num3){if (num1>=num3){
            JOptionPane.showMessageDialog(null,"3A ordem crescente dos números é: " + num3+" "+ num1+" "+ num2);
        } else{JOptionPane.showMessageDialog(null, "4A ordem crescente dos números é: " + num1+" "+ num3+" " +num2  );}}
        else if(num3>=num1 && num3>= num2){if (num1>=num2){
            JOptionPane.showMessageDialog(null,"5A ordem crescente dos números é: " + num2+" "+ num1+" "+ num3);
        } else{JOptionPane.showMessageDialog(null, "6A ordem crescente dos números é: " + num1+" "+ num2+" "+ num3  );}}
    }
    
}
