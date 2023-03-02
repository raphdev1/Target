import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            int valorAnterior = 0;
            int valorAtual = 1;
            boolean pertence = false;

            while (valorAtual <= numero) {
                if (valorAtual == numero) {
                    pertence = true;
                    break;
                }

                int proximoValor = valorAnterior + valorAtual;
                valorAnterior = valorAtual;
                valorAtual = proximoValor;
            }

            if (pertence) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }
        }
    }
}
