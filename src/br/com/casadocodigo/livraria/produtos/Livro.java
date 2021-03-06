package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;
import br.com.casadocodigo.livraria.produtos.Produto;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    public Autor autor;

    public Livro(Autor autor){
        if(autor == null){
            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
        }
        this.autor = autor;
    }
    



    public void mostraInfos(){
        System.out.println();
        System.out.println("Detalhes do Livro " + getNome());
        System.out.println("Nome do Livro: " + getNome());
        System.out.println("Descrição Livro: " + getDescricao());
        System.out.println("ISBN do Livro: " + getIsbn());
        System.out.println("O valor do livro é de: " + getValor());
        System.out.println();


        if (this.temAutor()){
            autor.infosAutor();
        }
    }


    boolean temAutor(){

        return this.autor != null; //Se o autor for diferente de null é a condição é verdadeira
    }

    @Override
    public int compareTo(Produto outro){
        if (this.getValor() < outro.getValor()){
            return -1;
        }
        if (this.getValor() > outro.getValor()){
            return 1;
        }
        return 0;
    }


    //Metodos Getters and Setter
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}


