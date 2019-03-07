/*
 * Conexão com banco de dados. 
 */
package br.senac.tads.pi3.gerenprod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author bruna.dpsantos
 */
public class DB {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "jdbc:mysql://localhost:8889"; //Mudar apenas isso
    private static final String BASEDADOS = "produtodb";
    private static final String LOGIN = "root"; //Mudar apenas isso
    private static final String SENHA = "root"; //Mudar apenas isso
    private static String url = "";
    private static Connection conexao;
    private static Statement comando;
    private final boolean autoCommit;

    
    public DB(boolean autoCommit) {
        this.autoCommit = autoCommit;
        
        try {
            Class.forName(DRIVER);
            url = SERVIDOR + BASEDADOS;
            conexao = DriverManager.getConnection(url, LOGIN, SENHA);
            conexao.setAutoCommit(autoCommit);
            comando = conexao.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Finaliza a alteração do banco de dados.
     */
    public void commit() {
        try {
            conexao.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Desfaz a alteração do banco de dados.
     */
    public void rollback() {
        try {
            conexao.rollback();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Fecha a conexão com o banco de dados.
     */
    public void close() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Executa as alterações (inserir, excluir e atualizar) no banco de dados.
     *
     * @param sql código a ser executado no banco de dados.
     * @return TRUE se executar com sucesso e FALSE se houver alguma falha.
     */
    public boolean executarAlteracao(String sql) {
        boolean retorno = false;

        try {
            int linhasAfetadas = comando.executeUpdate(sql);

            retorno = linhasAfetadas > 0;

        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                if (autoCommit) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                retorno = false;
            }
        }

        return retorno;
    }

    /**
     * Executa consultas no banco de dados.
     *
     * @param sql código a ser executado no banco de dados.
     * @return ResultSet com o resultado da consulta.
     */
    public ResultSet executarConsulta(String sql) {
        try {
            ResultSet rs = comando.executeQuery(sql);
            
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
}

    

