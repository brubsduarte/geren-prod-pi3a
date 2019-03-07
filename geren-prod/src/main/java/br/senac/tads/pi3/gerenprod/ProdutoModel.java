/*
 * Os getters e Setters e os métodos ficam nesta classe.
 */
package br.senac.tads.pi3.gerenprod;

/**
 * @author bruna.dpsantos
 */
public class ProdutoModel {
    
    private String nome;
    private String descricao;
    private double precoDeCompra;
    private double precoDeVenda;
    private int quantidade;
    private boolean produtoHabilitado;

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

    public boolean isProdutoHabilitado() {
        return produtoHabilitado;
    }

    public void setProdutoHabilitado(boolean produtoHabilitado) {
        this.produtoHabilitado = produtoHabilitado;
    }
    
    
    public static void listar(){//neste método deve conter a lógica para listar todos os produtos cadastrados. 
        
    } 
    
    public static void incluir(){//neste método deve conter a lógica para cadastrar produto na lista de produtos.
        
    }
    
    public static void editar(){//neste método deve conter a lógica para editar os dados de um produto já cadastrado. 
        
    }
    
    public static void excluir(){//neste método deve conter a lógica para excluir um produto que já foi cadastrado. 
        
    }
    
}