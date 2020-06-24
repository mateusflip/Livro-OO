public class LivroFisico extends Livro{

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
        System.out.println("Aplicando desconto no Livro Físico");
        return true;
     }
    }
}
