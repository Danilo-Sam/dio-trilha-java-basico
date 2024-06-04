import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int num1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int num2 = terminal.nextInt();

        try {
            contar(num1, num2);

        } catch (NumberFormatException e) {
            System.out.println("Os argumentos devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num2 - num1;
        for (int i = 1; i <= (contagem); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
