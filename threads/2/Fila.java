import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila = new LinkedList<>();
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
    }

    public synchronized void adicionar(int item) throws InterruptedException {
        while (fila.size() == capacidade) {
            wait(); // Espera até que haja espaço na fila
        }
        fila.add(item);
        System.out.println("Produtor adicionou: " + item + " | Tamanho da fila: " + fila.size());
        notifyAll(); // Notifica os consumidores que há itens na fila
    }

    public synchronized int retirar() throws InterruptedException {
        while (fila.isEmpty()) {
            wait(); // Espera até que haja itens na fila
        }
        int item = fila.removeFirst();
        System.out.println("Consumidor retirou: " + item + " | Tamanho da fila: " + fila.size());
        notifyAll(); // Notifica os produtores que há espaço na fila
        return item;
    }
}
