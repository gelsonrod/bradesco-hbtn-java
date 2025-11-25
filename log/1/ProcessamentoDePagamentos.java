import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);


    public static void main(String[] args) {

        Random random = new Random();

        // Processar 5 pagamentos
        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            try {
                // Simula tempo de processamento (1 segundo)
                Thread.sleep(1000);

                // Gera um número aleatório para simular o estado do pagamento
                // 0 = sucesso, 1 = falha, 2 = pendente
                int estado = random.nextInt(3);

                switch (estado) {
                    case 0:
                        // Pagamento bem-sucedido
                        logger.info("Pagamento {} processado com sucesso.", i);
                        break;
                    case 1:
                        // Falha no pagamento
                        logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                        break;
                    case 2:
                        // Pagamento pendente
                        logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                        break;
                }

            } catch (InterruptedException e) {
                logger.error("Erro ao processar o pagamento {}: {}", i, e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        logger.info("Processamento de pagamentos concluído.");
    }
}
