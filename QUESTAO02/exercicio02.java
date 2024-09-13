
package QUESTAO02;
import java.util.Scanner;
public class exercicio02 {
   
    
        // Função para contar ocorrências da letra 'a' (maiúscula e minúscula) em uma string
        public static int contarLetraA(String texto) {
            int contagem = 0;
            // Converte a string para minúsculas para facilitar a contagem
            String textoMinusculo = texto.toLowerCase();
    
            // Percorre cada caractere da string
            for (int i = 0; i < textoMinusculo.length(); i++) {
                if (textoMinusculo.charAt(i) == 'a') {
                    contagem++;
                }
            }
    
            return contagem;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita ao usuário uma string
            System.out.print("Digite uma string: ");
            String entrada = scanner.nextLine();
    
            // Conta o número de vezes que a letra 'a' ocorre
            int contagem = contarLetraA(entrada);
    
            // Exibe o resultado
            if (contagem > 0) {
                System.out.println("A letra 'a' ocorre " + contagem + " vez(es) na string.");
            } else {
                System.out.println("A letra 'a' não ocorre na string.");
            }
    
            scanner.close();
        
        }
    }
    
    

