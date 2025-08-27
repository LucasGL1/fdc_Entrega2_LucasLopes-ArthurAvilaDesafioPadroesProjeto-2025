import java.util.HashMap;
import java.util.Map;

public class Validador {
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    private static final Map<Tipo, EstrategiaValidacao> estrategias = new HashMap<>();

    static {
        estrategias.put(Tipo.EMAIL, new ValidaEmail());
        estrategias.put(Tipo.INTEIRO, new ValidaInteiro());
        estrategias.put(Tipo.MATRICULA, new ValidaMatricula());
    }

    public boolean valida(Tipo tipo, String valor) {
        EstrategiaValidacao estrategia = estrategias.get(tipo);
        if (estrategia == null) {
            throw new IllegalArgumentException("Tipo de validação não suportado: " + tipo);
        }
        return estrategia.validar(valor);
    }
}
