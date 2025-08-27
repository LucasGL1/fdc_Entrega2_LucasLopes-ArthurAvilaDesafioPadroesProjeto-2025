import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {
    private List<ProdutoComponente> produtos;

    public VendasEmMemoria() {
        produtos = new ArrayList<>();

        Produto p1 = new Produto(1, "Mochila", 1.55);
        Produto p2 = new Produto(2, "Caneta", 1.15);
        Produto p3 = new Produto(3, "Lapis", 32.99);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        // Criando um kit de volta às aulas
        KitProduto kit = new KitProduto(4, "Kit bem barato");
        kit.adicionarItem(p1);
        kit.adicionarItem(p2);
        kit.adicionarItem(p3);
        produtos.add(kit);
    }

    @Override
    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        ProdutoComponente prod = produtos.stream()
                .filter(p -> p.getId() == codigoProduto)
                .findFirst().get();
        umaVenda.registrarVenda(prod, quantidade);
    }

    @Override
    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    @Override
    public List buscarProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}
