import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("------------INFORMAÇÕES---------");
        System.out.println();
        System.out.println("Olá! Bem vindo ao Banco Guarda Grana! ");
        System.out.println("Para iniciarmos, informe seu nome e sobrenome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + " !");
        System.out.println("Vamos criar a sua conta! Informe o tipo de conta que deseja criar: (CC = Conta Corrente, CP = Conta Poupança)");
        String tipoConta = scanner.nextLine();


        System.out.println("Agora " + nomeCliente + " informe o saldo inicial que deseja depositar: ");
        String saldoInicial = scanner.nextLine();
        double saldoConta = Double.parseDouble(saldoInicial);


        System.out.println("Vamos acessar a sua conta!");
        System.out.println(nomeCliente + ", informe o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora informe o número da sua conta: ");
        String contaCliente = scanner.nextLine();
        int numeroConta = Integer.parseInt(contaCliente);

        System.out.println("Conta criada com sucesso!");

        System.out.println("*************************************************");
        System.out.println();
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("*************************************************");

        scanner.close();
    }

    //Exibir as mensagems para o usuário

    //Obter pela classe scanner os valores digitados no terminal

    //Exibir a mensagem da conta criada
}
