package fabricas;

import entidade.Produto;
import produtos.ColunaCsv;

import java.util.function.Function;

public class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "\n";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
       addColuna(new ColunaCsv(obtemValorColuna, titulo));
    }

}
