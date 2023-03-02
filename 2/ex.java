import java.util.Scanner;

public class ex {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            int valorAnterior = 0;
            int valorAtual = 1;
            boolean pertence = false;
            String sequencia = "0, 1"; // inicializa com os dois primeiros valores

            while (valorAtual <= numero) {
                if (valorAtual == numero) {
                    pertence = true;
                    break;
                }

                int proximoValor = valorAnterior + valorAtual;
                sequencia += ", " + proximoValor; // adiciona o próximo valor à sequência
                valorAnterior = valorAtual;
                valorAtual = proximoValor;
            }

            if (pertence) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }

            System.out.println("Sequência de Fibonacci até " + numero + ": " + sequencia);
        }
    }
}
