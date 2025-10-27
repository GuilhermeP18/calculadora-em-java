package calculadora;

public class Potencia extends OperacaoBinaria {
    public Potencia(double a, double b) {
        super("Potência", a, b);
    }

    @Override
    public double calcular() {
        return Math.pow(a, b);
    }
}
