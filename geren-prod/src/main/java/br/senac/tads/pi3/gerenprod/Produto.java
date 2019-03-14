/*
 * Os getters e Setters ficam nesta classe.
 */
package br.senac.tads.pi3.gerenprod;

import java.sql.Date;

/**
 * @author bruna.dpsantos
 */
public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double precoDeCompra;
    private double precoDeVenda;
    private int quantidade;
    private boolean produtoDisponivel;
    private Date dataCadastro;
    private String categorias;

    public Produto(String nome, String descricao, double precoDeCompra, double precoDeVenda, int quantidade, boolean produtoDisponivel) {

        this.nome = nome;
        this.descricao = descricao;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.quantidade = quantidade;
        this.produtoDisponivel = produtoDisponivel;

    }
    
    public Produto(int id, String nome, String descricao, double precoDeCompra, double precoDeVenda, int quantidade, boolean produtoDisponivel) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.quantidade = quantidade;
        this.produtoDisponivel = produtoDisponivel;

    }

    public Produto() {
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isProdutoDisponivel() {
        return produtoDisponivel;
    }

    public void setProdutoDisponivel(boolean produtoDisponivel) {
        this.produtoDisponivel = produtoDisponivel;
    }
    
    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

}
