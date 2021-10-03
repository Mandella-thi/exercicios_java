import java.util.Scanner;
public class precoMedioCdScanner {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int i,quantidadeCd;
        double valorTotal, precoCd;
        valorTotal=0;
        System.out.println("Digite o número de Cds");
        quantidadeCd = teclado.nextInt();
        for(i=1;i<=quantidadeCd;i++){
            System.out.println("Digite o valor do cd" +i);
            precoCd= teclado.nextDouble();
            valorTotal =valorTotal + precoCd;
        }
        System.out.println("O valor da coleção é:" +valorTotal);
        System.out.println("O valor medio do cd é:"+(valorTotal/quantidadeCd));
        teclado.close();
    }
    
}
