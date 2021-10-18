package fabricas;

import entidade.Produto;
import produtos.Coluna;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements IExportadorListaProduto {
    private List<Coluna> colunas;

    public AbstractExportadorListaProduto() {
        colunas = new ArrayList<>();
        addNewColuna(Produto::getId, "Id");
        addNewColuna(Produto::getDescricao, "Descrição");
        addNewColuna(Produto::getEstoque, "Estoque");
        addNewColuna(Produto::getPreco, "Preco");
        addNewColuna(Produto::getMarca, "Marca");
        addNewColuna(Produto::getModelo, "Modelo");
    }

    protected void addColuna(Coluna coluna) {
        colunas.add(coluna);
    }

    @Override
    public final String exportar(List<Produto> produtoList) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(abrirTabela());

        stringBuilder.append(abrirLinha());
        for (Coluna coluna : colunas) {
            stringBuilder.append(coluna.exportarCabeçalho());
        }
        stringBuilder.append(fecharLinha());
        stringBuilder.append("\n");
        stringBuilder.append(fecharLinhaTitulos());
        gerarLinhasProdutos(stringBuilder, produtoList);
        stringBuilder.append(fecharTabela());
        return stringBuilder.toString();
    }//metodo

    private void gerarLinhasProdutos(StringBuilder stringBuilder, List<Produto> produtoList) {
        for (Produto produto : produtoList) {
            stringBuilder.append(gerarColunasLinha(produto));
        }
    }//metodo

    protected String gerarColunasLinha(Produto produto) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(abrirLinha());

        for (Coluna coluna : colunas) {
            stringBuilder.append(coluna.exportarDado(produto));
        }//metodo
        stringBuilder.append(fecharLinha());
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    protected List<Coluna> getColunas() {
        return colunas;
    }
}//classe
