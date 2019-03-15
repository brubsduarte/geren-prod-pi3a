/*
 * Toda a parte de conexão do banco de dados ficará nesta classe. 
 */
package br.senac.tads.pi3.gerenprod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bruna.dpsantos
 */
public class ProdutoDao {

    public static ArrayList<Produto> consultarProdutos() {
        DB db = new DB(true);
        try {
            String sql = "SELECT produto.ID,produto.NOME,produto.DESCRICAO,produto.PRECO_COMPRA,produto.PRECO_VENDA,produto.QUANTIDADE,produto.DISPONIVEL,produto.DT_CADASTRO,GROUP_CONCAT(categoria.ID,'-', categoria.NOME SEPARATOR ', ') as CATEGORIAS FROM produto LEFT JOIN produto_categoria ON produto.ID = produto_categoria.ID_PRODUTO LEFT JOIN categoria ON categoria.ID = produto_categoria.ID_CATEGORIA GROUP BY produto.ID;";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Produto> produtos = new ArrayList();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setPrecoDeCompra(rs.getDouble("PRECO_COMPRA"));
                p.setPrecoDeVenda(rs.getDouble("PRECO_VENDA"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setProdutoDisponivel(rs.getBoolean("DISPONIVEL"));
                p.setDataCadastro(rs.getDate("DT_CADASTRO"));
                p.setCategorias(rs.getString("CATEGORIAS"));
                produtos.add(p);
            }
            db.close();
            return produtos;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            db.close();
            return null;
        }
    }

    public static boolean Atualizar(Produto p) {
        DB db = new DB(true);
        String sql
                = "UPDATE produto SET "
                + "NOME = '" + p.getNome() + "', "
                + "DESCRICAO = '" + p.getDescricao() + "', "
                + "PRECO_COMPRA = " + p.getPrecoDeCompra() + ", "
                + "PRECO_VENDA = " + p.getPrecoDeVenda() + ", "
                + "QUANTIDADE = " + p.getQuantidade() + ", "
                + "DISPONIVEL = " + p.isProdutoDisponivel() + " "
                + "Where ID = " + p.getId() + "; ";
        return db.executarAlteracao(sql);
    }

    public static boolean Salvar(Produto p) {
        DB db = new DB(true);
        String sql
                = "INSERT INTO produto "
                + "(NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DISPONIVEL)"
                + "VALUES ("
                + "'" + p.getNome() + "', "
                + "'" + p.getDescricao() + "', "
                + p.getPrecoDeCompra() + ", "
                + p.getPrecoDeVenda() + ", "
                + p.getQuantidade() + ", "
                + p.isProdutoDisponivel() + ");"; 
        return db.executarAlteracao(sql);
    }

    public static boolean Excluir(int produtoID) {
        DB db = new DB(true);
        String sql = "DELETE FROM produto Where ID = " + produtoID + ";";
        return db.executarAlteracao(sql);
    }
}
