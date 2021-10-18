package produtos;

import entidade.Produto;

public interface Coluna {
    String getTitulo();
    void setTitulo(String tiulo);
    String abrir();
    String fechar();
    String exportarCabeçalho();
    String exportarDado(Produto produto);
}
