import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = scanner.next();

        int dias = 0;

        if (mes.equalsIgnoreCase("Janeiro") || mes.equalsIgnoreCase("Março") || mes.equalsIgnoreCase("Maio") ||
                mes.equalsIgnoreCase("Julho") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Outubro") ||
                mes.equalsIgnoreCase("Dezembro")) {
            dias = 31;
        } else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junho") || mes.equalsIgnoreCase("Setembro") || mes.equalsIgnoreCase("Novembro")) {
            dias = 30;
        } else if (mes.equalsIgnoreCase("Fevereiro")) {
            dias = 28;
        }

        System.out.println("O mês de " + mes + " tem " + dias + " dias.");

        scanner.close();
    }
}