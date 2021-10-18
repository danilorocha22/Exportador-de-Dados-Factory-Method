package entidade;

public class Produto {
    private static int ultimoId = 0;
    private int id, estoque;
    private double preco;
    private String descricao, marca, modelo;

    public Produto() {
        this.id = ++ultimoId;
    }//construtor padrão

    public Produto(int estoque, double preco, String descricao, String marca, String modelo) {
        this();
        this.estoque = estoque;
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
    }//construtor sobrecarregado

    //getters e setters
    public int getId() {
        return id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
