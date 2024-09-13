import java.util.Scanner;

public class exercicio01 {

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int n) {
        if (n < 0) {
            return false; // Números negativos não pertencem à sequência de Fibonacci
        }

        // Inicializa os primeiros dois números da sequência de Fibonacci
        int a = 0, b = 1;

        // Enquanto o valor atual da sequência for menor ou igual ao número informado
        while (a <= n) {
            if (a == n) {
                return true; // O número pertence à sequência de Fibonacci
            }
            // Atualiza os valores para o próximo número da sequência
            int temp = a;
            a = b;
            b = temp + b;
        }

        return false; // O número não pertence à sequência de Fibonacci
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicita ao usuário um número
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            
            // Verifica se o número pertence à sequência de Fibonacci
            if (pertenceFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, informe um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}

  