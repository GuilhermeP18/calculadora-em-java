package calculadora;

import java.util.Scanner;

public class Calculadora {
    private Historico historico = new Historico();

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("7 - Histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                sc.next(); // limpa a entrada
                continue;
            }

            try {
                switch (opcao) {
                    case 1 -> executarBinaria(new Soma(lerNumero(sc, "A"), lerNumero(sc, "B")), " + ");
                    case 2 -> executarBinaria(new Subtracao(lerNumero(sc, "A"), lerNumero(sc, "B")), " - ");
                    case 3 -> executarBinaria(new Multiplicacao(lerNumero(sc, "A"), lerNumero(sc, "B")), " * ");
                    case 4 -> executarBinaria(new Divisao(lerNumero(sc, "A"), lerNumero(sc, "B")), " / ");
                    case 5 -> executarBinaria(new Potencia(lerNumero(sc, "Base"), lerNumero(sc, "Expoente")), "^");
                    case 6 -> executarUnaria(new RaizQuadrada(lerNumero(sc, "Valor")));
                    case 7 -> historico.listar();
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        sc.close();
    }

    private double lerNumero(Scanner sc, String nome) {
        System.out.print("Digite o número " + nome + ": ");
        return sc.nextDouble();
    }

    private void executarBinaria(OperacaoBinaria op, String simbolo) {
        double resultado = op.calcular();
        String expressao = op.a + simbolo + op.b;
        System.out.println("Resultado: " + resultado);
        historico.adicionar(expressao, resultado);
    }

    private void executarUnaria(OperacaoUnaria op) {
        double resultado = op.calcular();
        String expressao = op.getNome() + "(" + op.valor + ")";
        System.out.println("Resultado: " + resultado);
        historico.adicionar(expressao, resultado);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.iniciar();
    }
}
