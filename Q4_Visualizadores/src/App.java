import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var dados = new FonteDeDados();

        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();

        dados.addObserver(cm);
        dados.addObserver(cs);

        Scanner s = new Scanner(System.in);
        int valor;
        while (true) {
            System.out.println("\nEscolha um valor positivo maior que zero (? > 0):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0) break;
            dados.add(valor); // Agora notifica automaticamente
        }
        System.out.println("Fim");
    }
}
