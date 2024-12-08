import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double bonus = (salario > 2000) ? salario * 0.10 : salario * 0.05;

        System.out.println("O bônus do funcionário é: " + bonus);

        scanner.close();
    }
}