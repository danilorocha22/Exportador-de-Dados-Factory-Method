import entidade.Produto;
import fabricas.IExportadorListaProduto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(10, 4500, "Notebook", "Acer", "A-53"));
        produtos.add(new Produto(15, 950, "Celular", "Samsung", "J4+"));
        produtos.add(new Produto(20, 4000, "Vídeo Game", "PlayStation", "PS-5"));

        IExportadorListaProduto exportadorPadrao = IExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        exportadorPadrao.addNewColuna(Main::precoComDesconto, "Preço com desconto");
        System.out.println(exportadorPadrao.exportar(produtos));

        IExportadorListaProduto exportadorMarkdown = IExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        exportadorMarkdown.addNewColuna(Main::precoComDesconto, "Preço com desconto");
        System.out.println(exportadorMarkdown.exportar(produtos));

        IExportadorListaProduto exportadorCsv = IExportadorListaProduto.newInstance("csv");
        exportadorCsv.addNewColuna(Main::precoComDesconto, "Preço com desconto");
        System.out.println("Lista de Produtos em CSV\n");
        System.out.println(exportadorCsv.exportar(produtos));
    }//psvm

    private static double precoComDesconto(Produto produto) {
        return produto.getPreco() * 0.9;
    }
}
