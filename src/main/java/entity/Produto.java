package entity;

public class Produto {
    private static int ultimoId = 0;
    private int id, estoque;
    private String descricao, marca, modelo;

    public Produto() {
        this.id = ++ultimoId;
    }//construtor padrão

    public Produto(int estoque, String descricao, String marca, String modelo) {
        this();
        this.estoque = estoque;
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
