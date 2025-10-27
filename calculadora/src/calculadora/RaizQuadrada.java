package calculadora;

public class RaizQuadrada extends OperacaoUnaria {
    public RaizQuadrada(double valor) {
        super("Raiz Quadrada", valor);
    }

    @Override
    public double calcular() {
        if (valor < 0) {
            throw new ArithmeticException("Não é possível calcular raiz de número negativo!");
        }
        return Math.sqrt(valor);
    }
}
