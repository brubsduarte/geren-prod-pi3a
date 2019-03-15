/*
 * Os métodos ficam aqui.
 */
package br.senac.tads.pi3.gerenprod;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author bruna.dpsantos
 */
public class ProdutoController {

    public static boolean Salvar(String nome, String descricao, double precoDeCompra, double precoDeVenda,
            int quantidade, boolean produtoDisponivel, String categorias) {
        //Salvo na memória
        Produto p = new Produto(nome, descricao, precoDeCompra, precoDeVenda, quantidade, produtoDisponivel, categorias );
        return ProdutoDao.Salvar(p);
    }
    
    public static ArrayList<String> listarCategorias() {//neste método deve conter a lógica para listar todos os produtos cadastrados. 
        ArrayList<Categoria> categorias = ProdutoDao.consultarCategorias();
        ArrayList<String> listaCategorias = new ArrayList<>();

        for (int i = 0; i < categorias.size(); i++) {
            listaCategorias.add(String.valueOf(categorias.get(i).getId()) + " - " + categorias.get(i).getNome());
        }

        return listaCategorias;
    }

    public static ArrayList<String[]> listar() {//neste método deve conter a lógica para listar todos os produtos cadastrados. 
        ArrayList<Produto> produtos = ProdutoDao.consultarProdutos();

        ArrayList<String[]> listaProdutos = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < produtos.size(); i++) {
            String[] strings = new String[]{
                String.valueOf(produtos.get(i).getId()),
                df.format(produtos.get(i).getDataCadastro()),
                produtos.get(i).getNome(),
                produtos.get(i).getDescricao(),
                Double.toString(produtos.get(i).getPrecoDeCompra()),
                Double.toString(produtos.get(i).getPrecoDeVenda()),
                String.valueOf(produtos.get(i).getQuantidade()),
                produtos.get(i).isProdutoDisponivel() ? "SIM" : "NÃO",
                produtos.get(i).getCategorias()
            };

            listaProdutos.add(strings);
        }

        return listaProdutos;

    }

    public static void incluir() {//neste método deve conter a lógica para cadastrar produto na lista de produtos.

    }

    //neste método deve conter a lógica para editar os dados de um produto já cadastrado.
    public static boolean Atualizar(int id, String nome, String descrição, Double precoCompra, Double precoVenda, int quantidade, boolean produtoDisponivel, String categorias) {

        Produto p = new Produto(id, nome, descrição, precoCompra, precoVenda, quantidade, produtoDisponivel, categorias);
        return ProdutoDao.Atualizar(p);

    }

   public static boolean Excluir(int indice) {
        return ProdutoDao.Excluir(indice);
    }

}
