public class MiniLivro extends Livro{

    public MiniLivro(Autor autor){
        super(autor);
    }


    public boolean aplicaDesconto(double porcentagem){
        return false;
    }
}
