package calculadora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroOperacao {
    private String expressao;
    private double resultado;
    private LocalDateTime dataHora;

    public RegistroOperacao(String expressao, double resultado) {
        this.expressao = expressao;
        this.resultado = resultado;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "[" + dataHora.format(fmt) + "] " + expressao + " = " + resultado;
    }
}
