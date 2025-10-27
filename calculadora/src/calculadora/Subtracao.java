package calculadora;

public class Subtracao extends OperacaoBinaria {
    public Subtracao(double a, double b) {
        super("Subtração", a, b);
    }

    @Override
    public double calcular() {
        return a - b;
    }
}
