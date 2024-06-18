import java.util.Scanner;
public class Contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um parâmetro. ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite outro parâmetro. ");
        int parametroDois = scan.nextInt();
        scan.close();
        try {
             //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
          

		}catch (ParametrosInvalidosException e )  {
        //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
         System.out.println(" O segundo parâmetro deve ser maior que o primeiro. ");

		}


    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            throw new ParametrosInvalidosException();
        }
       
		//realizar o for para imprimir os números com base na variável contagem
        //leitura do for: int i e igual a parametro um. se parametro um for menor que o parametro 2 i++ signifca q o programa vai fazer oq deve
		for (int i = parametroUm; i < parametroDois; i++) {
           System.out.println("Imprimindo o número: " + i);
        }

        
	}
}