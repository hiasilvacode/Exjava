import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalarios = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários-mínimos.");

        scanner.close();
    }
}