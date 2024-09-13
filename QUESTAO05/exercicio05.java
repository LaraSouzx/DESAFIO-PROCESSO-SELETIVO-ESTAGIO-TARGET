package QUESTAO05;

public class exercicio05 {
    
        public static void main(String[] args) {
            // Inicializar estados dos interruptores
            boolean interruptor1 = false; // Desligado
            boolean interruptor2 = false; // Desligado
            boolean interruptor3 = true;  // Desligado inicialmente
    
            // Simular o tempo passando
            System.out.println("Ligue o Interruptor 1 e aguarde 10 minutos.");
            // Simulação de tempo (espera fictícia para o exemplo)
            try { Thread.sleep(10000); } catch (InterruptedException e) { }
    
            // Agora, desligue o Interruptor 1 e ligue o Interruptor 2
            interruptor1 = false;
            interruptor2 = true;
    
            // Simular a visita às lâmpadas
            String resultado = verificarLampadas(interruptor1, interruptor2, interruptor3);
            System.out.println(resultado);
        }
    
        public static String verificarLampadas(boolean interruptor1, boolean interruptor2, boolean interruptor3) {
            // Lâmpada 1 está acesa
            if (interruptor2) {
                return "A lâmpada 1 é controlada pelo Interruptor 2";
            }
            // Lâmpada 2 está quente (foi ligada anteriormente)
            else if (!interruptor1) {
                return "A lâmpada 2 é controlada pelo Interruptor 1";
            }
            // Lâmpada 3 está fria e apagada
            else {
                return "A lâmpada 3 é controlada pelo Interruptor 3";
            }
        }
    }
    

