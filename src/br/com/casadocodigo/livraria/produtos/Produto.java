package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto>{
    double getValor(); //Todos os métodos em interface são publicos
                        // Interfaces também não possuem atributos
                        // Toda classe que implementa a interface é obrigada a declarar seus métodos
}
