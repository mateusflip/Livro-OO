package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegistroDeVendas {

    private double total;
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mateus Ramos");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Banco de Dados");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Banco de Dados - br.com.casadocodigo.livraria.produtos.Ebook");
        ebook.setValor(29.90);

        if (fisico.aplicaDescontoDe10PorCento()){
            System.out.println("O valor do desconto agora é " + fisico.getValor());
        }

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total da compra " + carrinho.getTotal());


    }

}
