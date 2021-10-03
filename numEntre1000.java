/*25.  Exibir  todos  os  números  de  1000  a  1999  
que  quando  divididos  por  11  deixam  resto  =  5.*/

public class numEntre1000 {
    public static void main(String [] args){
        for(int i = 1000;i<=1999; i++){
            if(i%11==5){System.out.println(i);}
        }
    }
    
}
