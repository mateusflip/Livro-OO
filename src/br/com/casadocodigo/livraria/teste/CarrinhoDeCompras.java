package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;

public class CarrinhoDeCompras {

   private double total;
   private ArrayList<Produto> produtos; //Criando um array que só aceita objetos Produto

   public CarrinhoDeCompras(){
       this.produtos = new ArrayList<>();
   }

    public void adiciona(Produto produto){
       this.produtos.add(produto);
    }

    public void remove(int posicao){
       this.produtos.remove(posicao);
    }

    public double getTotal(){
       return total;
    }

    public ArrayList<Produto> getProdutos(){
       return produtos;
    }
}
