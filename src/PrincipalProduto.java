import modelo.Produto;
import modelo.ProdutoPerecivel;

import java.util.ArrayList;

public class PrincipalProduto {

    public static void main(String[] args) {
        Produto produto = new Produto("Computador",25.9,10);
        //produto.setNome("Computador");
        //produto.setQuantidade(10);
        //produto.setPreco(25.90);


        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto.add(produto);
        System.out.println(listaProduto.size());
        System.out.println(listaProduto.get(0).getNome());

        // 2- Imprimir depois que atualizar toString

        System.out.println(listaProduto);

        //3 Com construtor

        Produto produto2 = new Produto("Mouse",150,6);

        listaProduto.add(produto2);
        System.out.println(listaProduto);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);


    }


}
