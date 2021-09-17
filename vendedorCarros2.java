import javax.swing.JOptionPane;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de
suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir
o salário final do vendedor.*/

public class vendedorCarros2 {
    public static void main(String []args){
        int numeroCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de carros vendidos:"));
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo"));
        double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda dos carros"));
        double valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor todal de vendas"));
        double salariototal;
        if(valorTotalVendas> 300000){
            salariototal = numeroCarros*valorVendas +salarioFixo +valorTotalVendas*0.05 +5000;
            JOptionPane.showMessageDialog(null,"O valor total do salario é de : " + salariototal);

        } else{salariototal= numeroCarros*valorVendas+salarioFixo +valorTotalVendas*0.05;
        JOptionPane.showMessageDialog(null,"O valor total do salário é de:" + salariototal);}

    }
}
