import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário e obter os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        scanner.nextLine(); // Limpar o buffer do scanner
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem formatada
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo
        );
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}

