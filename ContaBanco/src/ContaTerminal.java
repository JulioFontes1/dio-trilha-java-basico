import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta.");
        int accountNumber = scanner.nextInt();
        System.out.println("Por favor, digite o número da sua agencia.");
        String agencyNumber = scanner.next();
        System.out.println("Por favor, digite o seu nome.");
        String name = scanner.next();
        System.out.println("Por favor, digite o seu saldo");
        float balance = scanner.nextFloat();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", name, agencyNumber, accountNumber, balance);

    }
}