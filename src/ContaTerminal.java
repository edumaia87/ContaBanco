import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sua conta");
        int numeroConta = scan.nextInt();

        System.out.println("Digite o número da agência");
        String numeroAgencia = scan.nextLine();
        scan.nextLine();

        System.out.println("Digite sue nome (Nome do cliente)");
        String nomeCliente = scan.nextLine();

        System.out.println("Digite o saldo da conta");
        double saldoConta = Double.parseDouble(scan.nextLine());

        System.out.println(
                "O número da sua conta é " +
                        numeroConta + " de agência " +
                        numeroAgencia + ", com o nome do cliente sendo " + nomeCliente +
                        " e com o saldo de " + saldoConta + " reais.");
    }
}