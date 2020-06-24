public abstract class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    Autor autor;

    public Livro(Autor autor){
        this.autor = autor;
    }
    
    public abstract boolean aplicaDesconto(double porcentagem);


    public void mostraInfos(){
        System.out.println();
        System.out.println("Detalhes do Livro " + getNome());
        System.out.println("Nome do Livro: " + getNome());
        System.out.println("Descrição do Livro: " + getDescricao());
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


    //Metodos Getters and Setter
    void setValor(double valor){
        this.valor = valor;
    }
    double getValor(){
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


