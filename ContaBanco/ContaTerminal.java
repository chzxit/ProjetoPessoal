import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //TODO:Conhecer e importar a classe Scanner 

        //TODO:Exibir as mensagens paras os nossos usuarios

        //TODO:obter pelo scanner os valores digitados no terminal 

        //TODO:Exibir a menssagem final

        System.out.println("Por favor, digite seu nome. ");
        String nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o numero da sua agência. ");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o numero da sua conta ");
        int conta = scan.nextInt();
        System.out.println("Por favor, digite seu saldo ");
        double saldo = scan.nextDouble();
        scan.nextLine();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "a sua conta é "+ conta + "," +" e seu saldo " + saldo + " já está disponível para saque");
        scan.close();     
    }
}