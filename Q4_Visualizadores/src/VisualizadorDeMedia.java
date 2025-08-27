import java.util.List;

public class VisualizadorDeMedia implements Observer {

    @Override
    public void atualizar(List<Integer> valores) {
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Média: " + media + ", quantidade: " + valores.size());
    }
}
