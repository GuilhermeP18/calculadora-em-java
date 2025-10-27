package calculadora;

public abstract class OperacaoUnaria extends Operacao {
    protected double valor;

    public OperacaoUnaria(String nome, double valor) {
        super(nome);
        this.valor = valor;
    }
}
