import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("pt-BR"),
            "[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario);
    }

    @Override
    public int compareTo(Pessoa outra) {
        // Intercalar: par/ímpar alternando, ordem decrescente dentro de cada grupo
        int thisGrupo = this.codigo % 2;  // 0 = par, 1 = ímpar
        int outraGrupo = outra.codigo % 2;
        
        // Dentro de pares ou ímpares, ordem decrescente
        int thisOrdem = this.codigo / 2;
        int outraOrdem = outra.codigo / 2;
        
        if (thisOrdem != outraOrdem) {
            return Integer.compare(outraOrdem, thisOrdem);
        }
        
        // Se mesma "camada", par vem antes
        return Integer.compare(thisGrupo, outraGrupo);
    }
}
