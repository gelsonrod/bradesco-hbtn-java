import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
            .map(produto -> {
                if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                    produto.setPreco(produto.getPreco() * 0.85);
                }
                return produto;
            })
            .collect(Collectors.toList());
    }
}
