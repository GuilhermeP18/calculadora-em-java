package calculadora;

public class Multiplicacao extends OperacaoBinaria {
    public Multiplicacao(double a, double b) {
        super("Multiplicação", a, b);
    }

    @Override
    public double calcular() {
        return a * b;
    }
}
