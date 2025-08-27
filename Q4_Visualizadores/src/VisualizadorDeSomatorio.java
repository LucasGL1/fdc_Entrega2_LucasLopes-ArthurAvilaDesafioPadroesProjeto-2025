import java.util.List;

public class VisualizadorDeSomatorio implements Observer {

    @Override
    public void atualizar(List<Integer> valores) {
        int soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatório: " + soma + ", quantidade: " + valores.size());
    }
}
