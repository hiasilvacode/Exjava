import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o turno (M para Matutino, V para Vespertino): ");
        char turno = scanner.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia, aluno!");
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa tarde, aluno!");
        } else {
            System.out.println("Turno inválido.");
        }

        scanner.close();
    }
}