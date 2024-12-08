import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int soma = 0;

        do {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
            i++;
        } while (i <= 5);

        double media = soma / 5.0;
        System.out.println("A média aritmética dos valores lidos é: " + media);

        scanner.close();
    }
}
