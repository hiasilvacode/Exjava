import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco = (quantidade < 12) ? 0.50 : 0.40;
        double total = preco * quantidade;

        System.out.println("Valor total a ser pago: R$ " + total);

        scanner.close();
    }
}