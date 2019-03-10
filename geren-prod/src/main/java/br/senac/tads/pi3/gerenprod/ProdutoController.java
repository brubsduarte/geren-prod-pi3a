/*
 * Os métodos ficam aqui.
 */
package br.senac.tads.pi3.gerenprod;

/**
 *
 * @author bruna.dpsantos
 */

public class ProdutoController {
    
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public boolean addProduto(Produto produto) {

        return produtoDao.cadastroProduto(produto);
    }
    
    public static void listar(){//neste método deve conter a lógica para listar todos os produtos cadastrados. 
        ProdutoDao
    } 
    
    public static void incluir(){//neste método deve conter a lógica para cadastrar produto na lista de produtos.
        
    }
    
    public static void editar(){//neste método deve conter a lógica para editar os dados de um produto já cadastrado. 
        
    }
    
    public static void excluir(){//neste método deve conter a lógica para excluir um produto que já foi cadastrado. 
        
    }
    
}
