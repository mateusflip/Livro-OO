package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
   private double total;
    public void adiciona(Produto produto){
        System.out.println("Adicionado: " + produto);
        total += produto.getValor();
    }
    public double getTotal(){
        return total;
    }
}