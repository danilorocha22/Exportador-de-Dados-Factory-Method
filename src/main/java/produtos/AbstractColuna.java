package produtos;

import entidade.Produto;

import java.util.function.Function;

public abstract class AbstractColuna implements Coluna {
    private Function<Produto, Object> obtemValorColuna;
    private String titulo;

    public AbstractColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        this.obtemValorColuna = obtemValorColuna;
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String tiulo) {
        titulo = tiulo;
    }

    @Override
    public String exportarCabeçalho() {
        return abrir() + titulo +  fechar();
    }

    @Override
    public String exportarDado(Produto produto) {
        Object retorno = obtemValorColuna.apply(produto);
        return abrir() + retorno.toString() + fechar();
    }
}
