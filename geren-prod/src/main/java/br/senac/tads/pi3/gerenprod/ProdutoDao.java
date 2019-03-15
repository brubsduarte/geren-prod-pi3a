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

    public static ArrayList<Categoria> consultarCategorias() {
        DB db = new DB(true);
        try {
            String sql = "SELECT * FROM categoria;";
            ResultSet rs = db.executarConsulta(sql);
            ArrayList<Categoria> categorias = new ArrayList();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                categorias.add(c);
            }
            db.close();
            return categorias;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            db.close();
            return null;
        }
    }
    
    public static ArrayList<Produto> consultarProdutos() {
        DB db = new DB(true);
        try {
            String sql = "SELECT produto.ID,produto.NOME,produto.DESCRICAO,produto.PRECO_COMPRA,produto.PRECO_VENDA,produto.QUANTIDADE,produto.DISPONIVEL,produto.DT_CADASTRO,GROUP_CONCAT(categoria.ID,' - ', categoria.NOME SEPARATOR ', ') as CATEGORIAS FROM produto LEFT JOIN produto_categoria ON produto.ID = produto_categoria.ID_PRODUTO LEFT JOIN categoria ON categoria.ID = produto_categoria.ID_CATEGORIA GROUP BY produto.ID;";
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
        DB db = new DB(false);
        
        try {
            
            String sql
                = "UPDATE produto SET "
                + "NOME = '" + p.getNome() + "', "
                + "DESCRICAO = '" + p.getDescricao() + "', "
                + "PRECO_COMPRA = " + p.getPrecoDeCompra() + ", "
                + "PRECO_VENDA = " + p.getPrecoDeVenda() + ", "
                + "QUANTIDADE = " + p.getQuantidade() + ", "
                + "DISPONIVEL = " + p.isProdutoDisponivel() + " "
                + "Where ID = " + p.getId() + "; ";
            
            if (!db.executarAlteracao(sql)) {
                throw new Exception("Não foi possível atualizar o produto.");
            }
            
            sql = "DELETE FROM produto_categoria WHERE ID_PRODUTO = " + p.getId() + ";";
            
            db.executarAlteracao(sql);
            
            if (!p.getCategorias().isEmpty()) {
                sql = "INSERT INTO produto_categoria (ID_Produto, ID_CATEGORIA) VALUES ";
            
                String[] categorias = p.getCategorias().split(", ");

                for (String categoria : categorias) {
                    String id = categoria.split(" - ")[0];
                    sql += "(" + p.getId() + "," + id + "),";
                }
                
                sql = sql.substring(0, sql.length() - 1);
                sql += ";";
                
                if (!db.executarAlteracao(sql)) {
                    throw new Exception("Não foi possível salvar as categorias do produto.");
                }
            }
            
            db.commit();
            db.close();
            return true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            db.rollback();
            db.close();
            return false;
        }
    }

    public static boolean Salvar(Produto p) {
        DB db = new DB(false);
        
        try {
            
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
            
            if (!db.executarAlteracao(sql)) {
                throw new Exception("Não foi possível cadastrar o produto.");
            }
            
            sql = "SELECT ID FROM produto ORDER BY DT_CADASTRO DESC LIMIT 1;";
            
            ResultSet rs = db.executarConsulta(sql);
            int idProduto = 0;
            
            while (rs.next()) {
                idProduto = rs.getInt("ID");
            }
            
            if (idProduto == 0) {
                throw new Exception("Não foi possível cadastrar o produto.");
            }
            
            if (!p.getCategorias().isEmpty()) {
                sql = "INSERT INTO produto_categoria (ID_Produto, ID_CATEGORIA) VALUES ";
            
                String[] categorias = p.getCategorias().split(", ");

                for (String categoria : categorias) {
                    String id = categoria.split(" - ")[0];
                    sql += "(" + idProduto + "," + id + "),";
                }
                
                sql = sql.substring(0, sql.length() - 1);
                sql += ";";
                
                if (!db.executarAlteracao(sql)) {
                    throw new Exception("Não foi possível salvar as categorias do produto.");
                }
            }
            
            db.commit();
            db.close();
            return true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            db.rollback();
            db.close();
            return false;
        }
    }

    public static boolean Excluir(int produtoID) {
        DB db = new DB(true);
        String sql = "DELETE FROM produto Where ID = " + produtoID + ";";
        return db.executarAlteracao(sql);
    }
}
