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
    public static boolean Salvar(Produto p) {
        DB db = new DB(true);
        String sql = 
                "INSERT INTO produto "
                + "(ID,NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO)"
                + "VALUES ("
                + "'"+p.getId()+"', "
                + "'"+p.getNome()+"', "
                + "'"+p.getDescricao()+"', "
                + "'"+p.getPrecoDeCompra()+"', "
                + "'"+p.getPrecoDeVenda()+"', "
                + "'"+p.getQuantidade()+"', "
                + "'"+p.isProdutoDisponivel()+"');";             
        return db.executarAlteracao(sql);
    }

    /**
     * 
     * @param p
     * @return 
     */
    public static boolean Atualizar(Produto p) {
        DB db = new DB(true);
        String sql = 
                "UPDATE produto SET "
                + "ID = '"+p.getId()+"', "
                + "NOME = '"+p.getNome()+"', "
                + "DESCRICAO = '"+p.getDescricao()+"', "
                + "PRECO_COMPRA = '"+p.getPrecoDeCompra()+"', "
                + "PRECO_VENDA = '"+p.getPrecoDeVenda()+"', "
                + "QUANTIDADE = "+p.getQuantidade()+", "
                + "DISPONIVEL = '"+p.isProdutoDisponivel()+";";
        return db.executarAlteracao(sql);
    }
    
     /**
     * 
     * @param produtoID
     * @return 
     */
    public static boolean Excluir(int produtoID) {
        DB db = new DB(true);
        String sql = "DELETE FROM produto Where ID = "+produtoID+";";
        return db.executarAlteracao(sql);
    }

    public static ArrayList<Produto> getProdutos() {
        DB db = new DB(true);
        try {
            String sql = "SELECT * FROM produto;";
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

    public static ArrayList<Produto> filtrarProdutos(int id, String titulo, String autor, String genero, String editora) {
        DB db = new DB(true);
        try {
            String sql = "SELECT * FROM produto WHERE ";
            if (id != 0) {
                sql += "ID = "+id+" AND ";
            }
            sql += "titulo LIKE '%"+titulo+"%' AND autor LIKE '%"+autor+"%' AND genero LIKE '%"+genero+"%' AND editora LIKE '%"+editora+"%';";
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
}
    
    

