package calculadora;

public abstract class Operacao {
    protected String nome;

    public Operacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcular();
}
