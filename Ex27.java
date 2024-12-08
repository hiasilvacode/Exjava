import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);

        if ((sexo == 'M' || sexo == 'm') && idade >= 65) {
            System.out.println("Homem pode se aposentar.");
        } else if ((sexo == 'F' || sexo == 'f') && idade >= 60) {
            System.out.println("Mulher pode se aposentar.");
        } else {
            System.out.println("Pessoa não pode se aposentar.");
        }

        scanner.close();
    }
}