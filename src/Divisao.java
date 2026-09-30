import java.util.InputMismatchException;
import java.util.Scanner;
public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAM = 2;
        int[] numero = new int[TAM];
        boolean entradaValida = false;

// Leitura dos números, tratando entrada não numérica
        for (int i = 0; i < TAM; i++) {
            entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    numero[i] = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite apenas números.");
                    scanner.nextLine(); // limpa o buffer para nova tentativa
                }
            }
        }
// Divisão, tratando divisão por zero
        try {
            int resultado = numero[0] / numero[1];
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        }
        scanner.close();
    }
}