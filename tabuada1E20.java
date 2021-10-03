import java.util.Scanner;


/* 24. Ler um número inteiro entre 1 e 20 e exibir sua tabuada.
 Utilize os 3 comandos de laço de repetição,  para  praticar.*/

public class tabuada1E20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Digite a taboada que deseja ver");
        num= teclado.nextInt();
        for(int x = 1; x<=10; x++){
            System.out.println(num +"X"+x +"=" +(num*x));
        }
    teclado.close();
    }
    
}
