package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<RegistroOperacao> registros = new ArrayList<>();

    public void adicionar(String expressao, double resultado) {
        registros.add(new RegistroOperacao(expressao, resultado));
    }

    public void listar() {
        if (registros.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
            return;
        }

        System.out.println("\n=== Histórico de Operações ===");
        for (RegistroOperacao r : registros) {
            System.out.println(r);
        }
    }
}
