import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menores = 0, maiores = 0;
        int idade;

        System.out.print("Digite o número de pessoas: ");
        int totalPessoas = scanner.nextInt();

        int i = 0;
        while (i < totalPessoas) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = scanner.nextInt();

            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
            i++;
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);

        scanner.close();
    }
}