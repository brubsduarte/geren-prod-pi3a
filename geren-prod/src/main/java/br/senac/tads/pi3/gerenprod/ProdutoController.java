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
    
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public boolean addProduto(Produto produto) {

        return produtoDao.cadastroProduto(produto);
    }
    
    public static ArrayList<String[]> listar(){//neste método deve conter a lógica para listar todos os produtos cadastrados. 
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
                Boolean.valueOf(produtos.get(i).getProdutoDisponivel()).toString(),
            };

            listaProdutos.add(strings);
        }

        return listaProdutos;

    } 
    
    public static void incluir(){//neste método deve conter a lógica para cadastrar produto na lista de produtos.
        
    }
    
    //neste método deve conter a lógica para editar os dados de um produto já cadastrado.
    public static boolean Atualizar(int id,String nome, String descrição, Double precoCompra, Double precoVenda, int quantidade, boolean produtoDisponivel){ 
            
        Produto p = new Produto(id , nome, descrição, precoCompra, precoVenda, quantidade, produtoDisponivel);
        return ProdutoDao.Atualizar(p);

    }
    
    public static void excluir(){//neste método deve conter a lógica para excluir um produto que já foi cadastrado. 
        
    }
    
}
