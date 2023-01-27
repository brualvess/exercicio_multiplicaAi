import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        multiply();
    }

    public static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = Integer.parseInt(scanner.next());
        System.out.println("Tabela de multiplicação de " + number + ":");
        for (int i = 0; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);

        }
    }
}
