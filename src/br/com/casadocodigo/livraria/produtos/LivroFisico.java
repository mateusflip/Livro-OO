package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
    public boolean aplicaDesconto(double porcentagem){
    if (porcentagem > 0.3){
        return false;

    }else{
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no br.com.casadocodigo.livraria.produtos.Livro Físico");
        return true;
     }
    }
}
