import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double saldo;
        String nome,agencia;
        System.out.println("Bem vindo ao banco DIO\n");
        System.out.println("Por favor, digite o número da numero!");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Por favor, digite o numero da agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite seu nome!");
        nome = sc.nextLine();
        System.out.println("Por favor, digite seu saldo!");
        saldo = Double.parseDouble(sc.nextLine());

        ContaTerminal conta = new ContaTerminal(numero,agencia,nome,saldo);
        System.out.println(conta);
    }
}
