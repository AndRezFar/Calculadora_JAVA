import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a variavel A:");
        double a = scanner.nextDouble();

        System.out.println("Selecione a variavel b:");
        double b = scanner.nextDouble();

        System.out.println("Selecione as seguintes operacoes:");
        System.out.println("1 - Somar;");
        System.out.println("2 - Subtrair;");
        System.out.println("3 - Multiplicar;");
        System.out.println("4 - Dividir;");
        System.out.println("5 - Sair.");
        int d = scanner.nextInt();

        Calculos.calculo(a,b,d);
    }
}
