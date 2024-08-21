import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do seu Saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "+ saldoConta +" já está disponível para saque");
    }
}