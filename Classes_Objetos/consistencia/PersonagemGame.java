public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        int novaSaude = this.saudeAtual - quantidadeDeDano;
        if (novaSaude < 0) {
            novaSaude = 0;
        }
        setSaudeAtual(novaSaude);
    }

    public void receberCura(int quantidadeDeCura) {
        int novaSaude = this.saudeAtual + quantidadeDeCura;
        if (novaSaude > 100) {
            novaSaude = 100;
        }
        setSaudeAtual(novaSaude);
    }
}
