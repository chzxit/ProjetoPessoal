
import java.util.Scanner;

public class DasafioDio {
    //Desafio
//Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.

//Para realizar o cálculo receba o valor bruto do salário e o adicional dos benefícios.

//O salário a ser transferido é calculado da seguinte maneira:

//(valor bruto do salario - percentual de imposto mediante ao salario) + adicional dos benefıcios
//(valor bruto do salario - percentual de imposto mediante ao salario) + adicional dos benefıcios

//Para calcular o percentual de imposto segue as alíquotas:

//De R$ 0.00 a R$ 1100.00 = 5.00%
//De R$ 1100.01 a R$ 2500.00 = 10.00%
//Maior que R$ 2500.00 = 15.00%

//Entrada
//A entrada consiste em vários arquivos de teste, que conterá o valor bruto do salário e adicional dos benefícios. Conforme mostrado no exemplo de entrada a seguir.

//Saída
//Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerada uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salarial somado com o adicional dos benefícios. Use o exemplo abaixo para clarear o que está sendo pedido.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario bruto: ");
        double salarioBruto = scan.nextDouble();
        System.out.println("Digite os adicionais: ");
        double adicionais = scan.nextDouble();
        scan.close();

       
            double valorImposto = 0;
        if(salarioBruto >= 0 && salarioBruto <= 1100){
                 valorImposto = 0.05 * salarioBruto;

        }else if (salarioBruto >= 1100.01 && salarioBruto <= 2500) {
                 valorImposto = 0.10 * salarioBruto;
            
        }else if(salarioBruto > 2500){
                valorImposto = 0.15 * salarioBruto;

        }

        double salarioAserTransferido = (salarioBruto - valorImposto) + adicionais;
        System.out.println("O salário a ser transferido é " + salarioAserTransferido);


    }
}
