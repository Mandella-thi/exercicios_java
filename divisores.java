/* 26.  Exibir  todos  os  divisores 
 de  um  número  inteiro  positivo  lido.*/

import java.util.Scanner;

public class divisores {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número e saiba seu divisores");
        int num =teclado.nextInt();
        for(int i =1; i<=num; i++){
            if(num%i ==0){
                System.out.println(i);
            }
        }
        teclado.close();
    }
    
}
