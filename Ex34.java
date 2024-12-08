import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("A pessoa pode votar.");
        } else {
            System.out.println("A pessoa não pode votar.");
        }

        scanner.close();
    }
}