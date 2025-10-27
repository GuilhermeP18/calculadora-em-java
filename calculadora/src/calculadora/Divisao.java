package calculadora;

public class Divisao extends OperacaoBinaria {
    public Divisao(double a, double b) {
        super("Divisão", a, b);
    }

    @Override
    public double calcular() {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return a / b;
    }
}
