package calculadora;

public abstract class OperacaoBinaria extends Operacao {
    protected double a, b;

    public OperacaoBinaria(String nome, double a, double b) {
        super(nome);
        this.a = a;
        this.b = b;
    }
}
