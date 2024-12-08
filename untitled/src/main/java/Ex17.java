import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade <= 59) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }

        scanner.close();
    }
}