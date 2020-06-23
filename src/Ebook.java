public class Ebook extends Livro{
    private String watermark;

    public Ebook(Autor autor){
        super(autor); //Delega a função do construtor para a superclasse

    }

    @Override
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.15){
            return false;

        }else{
            System.out.println("Aplicando desconto no Ebook");
            return super.aplicaDesconto(porcentagem);

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
