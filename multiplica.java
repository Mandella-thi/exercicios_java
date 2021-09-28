import java.util.Scanner;
public class multiplica {
    public static void main(String [] args){
        


	  // leitura de um numero entre 1 e 20
		int teclado;
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("digite um número: ");
	  teclado=scanner.nextInt();

	  int multiplica = 1;
	  int resultado;
	  for(multiplica =1; multiplica <= 10; multiplica++){
			resultado = teclado * multiplica;
			System.out.println(resultado);			
	  }
	  scanner.close();
	  
  } 
}
    }
    
}
