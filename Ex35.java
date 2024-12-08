import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int fatorial = 1;
        int i = 1;

        while (i <= num) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);

        scanner.close();
    }
}