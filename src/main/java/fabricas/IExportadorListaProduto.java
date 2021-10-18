package fabricas;

import entidade.Produto;

import java.util.List;
import java.util.function.Function;

public interface IExportadorListaProduto {

    public String abrirTabela();
    public String fecharTabela();
    public String abrirLinha();
    public String  fecharLinha();
    public String fecharLinhaTitulos();

    public String exportar(List<Produto> produtoList);

    void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo);

    public static IExportadorListaProduto newInstance() {
        return newInstance("html");
    }//metodo

    public static IExportadorListaProduto newInstance(String tipoDeArquivo) {
        switch (tipoDeArquivo) {
            case "html" : return new ExportadorListaProdutoHtml();
            case "md" : return new ExportadorListaProdutoMarkdown();
            case "csv" : return new ExportadorListaProdutoCsv();
            default: throw new UnsupportedOperationException("Formato não suportado: "+ tipoDeArquivo);
        }
    }//metodo

}//classe
