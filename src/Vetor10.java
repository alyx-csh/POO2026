import java.util.InputMismatchException;
import java.util.Scanner;
public class Vetor10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAM = 10;
        int[] vetor = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();

        }
        scanner.close();
        for (int i = 0; i < TAM; i++) {
            System.out.printf("Valor que está na posição %d do vetor: %d\n",i+1,vetor[i]);
        }
    }
}
