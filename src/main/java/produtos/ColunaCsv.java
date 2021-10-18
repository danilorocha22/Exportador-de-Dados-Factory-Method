package produtos;

import entidade.Produto;

import java.util.function.Function;

public class ColunaCsv extends AbstractColuna{
    public ColunaCsv(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "";
    }

    @Override
    public String fechar() {
        return ",";
    }
}
