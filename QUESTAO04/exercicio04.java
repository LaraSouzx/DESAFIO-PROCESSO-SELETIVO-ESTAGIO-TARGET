package QUESTAO04;

public class exercicio04 {
   
        public static void main(String[] args) {
            // Sequência a: 1, 3, 5, 7, ___
            int ultimoElementoA = 7;
            int proximoElementoA = ultimoElementoA + 2;
            System.out.println("Próximo elemento da sequência a: " + proximoElementoA);
    
            // Sequência b: 2, 4, 8, 16, 32, 64, ____
            int ultimoElementoB = 64;
            int proximoElementoB = ultimoElementoB * 2;
            System.out.println("Próximo elemento da sequência b: " + proximoElementoB);
    
            // Sequência c: 0, 1, 4, 9, 16, 25, 36, ____
            int ultimoIndiceC = 6; // o índice do último elemento (36 é 6^2)
            int proximoElementoC = (ultimoIndiceC + 1) * (ultimoIndiceC + 1);
            System.out.println("Próximo elemento da sequência c: " + proximoElementoC);
    
            // Sequência d: 4, 16, 36, 64, ____
            int ultimoIndiceD = 8; // o índice do último elemento (64 é 8^2)
            int proximoIndiceD = ultimoIndiceD + 2; // incrementa o índice
            int proximoElementoD = proximoIndiceD * proximoIndiceD;
            System.out.println("Próximo elemento da sequência d: " + proximoElementoD);
    
            // Sequência e: 1, 1, 2, 3, 5, 8, ____
            int a = 5; // o penúltimo número
            int b = 8; // o último número
            int proximoElementoE = a + b;
            System.out.println("Próximo elemento da sequência e: " + proximoElementoE);
    
            // Sequência f: 2, 10, 12, 16, 17, 18, 19, ____
            int ultimoElementoF = 19;
            int proximoElementoF = ultimoElementoF + 1; // assume que a sequência segue com o próximo número consecutivo
            System.out.println("Próximo elemento da sequência f: " + proximoElementoF);
        }
    }
    

