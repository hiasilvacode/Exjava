import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        scanner.close();
    }
}