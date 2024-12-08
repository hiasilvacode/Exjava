import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0;

        switch (codigo) {
            case 1: preco = 10.0; break;
            case 2: preco = 15.0; break;
            case 3: preco = 20.0; break;
            default: System.out.println("Código inválido.");
        }

        double total = preco * quantidade;
        System.out.println("Valor total a ser pago: R$ " + total);

        scanner.close();
    }
}