package calculadora;

public class Soma extends OperacaoBinaria {
    public Soma(double a, double b) {
        super("calculadora.Soma", a, b);
    }

    @Override
    public double calcular() {
        return a + b;
    }
}