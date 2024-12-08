import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.15;
        System.out.println("O novo salário com aumento de 15% é: " + novoSalario);

        scanner.close();
    }
}