
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite a agência:  ");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Por favor, digite o saldo da conta:  ");
            double saldo = scanner.nextDouble();
            
            
            String message = "Olá " + nomeCliente + ",\n" +
                    "obrigado por criar uma conta em nosso banco,\n" +
                    "sua agência é " + agencia + ",\n" +
                    "conta " + numeroConta + " e seu saldo " + "R$ " + saldo + " já está disponível para saque.";
            
            System.out.println(message);
        }
    }
}
