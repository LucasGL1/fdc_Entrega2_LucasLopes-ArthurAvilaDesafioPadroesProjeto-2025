import java.util.ArrayList;
import java.util.List;

public class KitProduto implements ProdutoComponente {
    private int id;
    private String nome;
    private List<ProdutoComponente> itens = new ArrayList<>();

    public KitProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarItem(ProdutoComponente item) {
        itens.add(item);
    }

    public void removerItem(ProdutoComponente item) {
        itens.remove(item);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0.0;
        for (ProdutoComponente item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public List<ProdutoComponente> getItens() {
        return itens;
    }
}
