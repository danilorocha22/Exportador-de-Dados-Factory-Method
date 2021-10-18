package fabricas;

import entidade.Produto;
import produtos.Coluna;
import produtos.ColunaMarkdown;

import java.util.function.Function;

public class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {

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
        StringBuilder sb = new StringBuilder();
        for (Coluna coluna : getColunas()) {
            sb.append(coluna.abrir() + "-----");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        addColuna(new ColunaMarkdown(obtemValorColuna, titulo));
    }

}//Classe
