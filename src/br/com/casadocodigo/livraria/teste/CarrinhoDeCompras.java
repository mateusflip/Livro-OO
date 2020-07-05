package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
   private double total;
   private Produto[] produtos = new Produto[10];
   private int contador = 0;

   
   
    public void adiciona(Produto produto){
        System.out.println("Adicionado: " + produto);
        this.produtos[contador] = produto;
        contador ++;
        total += produto.getValor();
    }

    public Produto[] getProdutos(){
        for(int i = 0; i < produtos.length; i++){
            Produto produto = produtos[i];
            if (produto != null){
                System.out.println(produto.getValor());
            }
        }
        return new Produto[0];
    }
    public double getTotal(){
        return total;
    }
}
