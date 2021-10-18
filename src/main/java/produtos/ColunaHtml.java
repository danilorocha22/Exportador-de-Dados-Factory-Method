package produtos;

import entidade.Produto;

import java.util.function.Function;

public class ColunaHtml extends AbstractColuna {
    public ColunaHtml(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }
}
