package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Ebook extends Livro implements Promocional {
    private String watermark;

    public Ebook(Autor autor){
        super(autor); //Delega a função do construtor para a superclasse

    }
    @Override
    public String toString(){
        return "Eu sou um Ebook";
    }

    @Override
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.15){
            return false;

        }else{
            System.out.println("Aplicando desconto no br.com.casadocodigo.livraria.produtos.Ebook");
            return aplicaDesconto(porcentagem);

        }

    }


    //Getters and Setters
    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
