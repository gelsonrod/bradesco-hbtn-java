public class SistemaFilas {
    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila(10); // Fila com capacidade para 10 itens

        // Criar 2 produtores
        Produtor produtor1 = new Produtor(fila);
        Produtor produtor2 = new Produtor(fila);

        // Criar 2 consumidores
        Consumidor consumidor1 = new Consumidor(fila);
        Consumidor consumidor2 = new Consumidor(fila);

        // Iniciar as threads
        produtor1.start();
        produtor2.start();
        consumidor1.start();
        consumidor2.start();

        // Executar por 20 segundos
        Thread.sleep(20000);

        // Encerrar o programa
        System.exit(0);
    }
}
