import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next(); // String nomeCliente = "Mario Andrade";

        System.out.println("Por favor, digite o número da conta! ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua agência! ");
        String agencia = scanner.next(); //String agencia = "067-8";
    
        System.out.println("Digite o valor para deposito: ");
        double deposito = scanner.nextDouble();

        double saldo = 237.48;
        saldo = deposito + saldo;       

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);

        System.out.println(mensagem);

    }
}
