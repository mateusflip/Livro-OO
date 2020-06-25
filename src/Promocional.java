@FunctionalInterface // Marcação de uma interface funcional e impede que tenhamos outro método abstrato
public interface Promocional {
    boolean aplicaDesconto(double porcentagem);

    default boolean aplicaDescontoDe10PorCento(){
        return aplicaDesconto(0.1);
        //Método Default não precisa ser reescrito nas classes que são implementadas
    }
}
