import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        // Obter pela scanneer os valores digitados
        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o sua Agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu numero");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}
