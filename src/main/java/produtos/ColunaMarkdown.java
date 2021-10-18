package produtos;

import entidade.Produto;

import java.util.function.Function;

public class ColunaMarkdown extends AbstractColuna {
    public ColunaMarkdown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return " | ";
    }

    @Override
    public String fechar() {
        return "";
    }
}
