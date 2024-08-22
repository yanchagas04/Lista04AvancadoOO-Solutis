public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer(int quantidadeDeComida) {
        setPeso(getPeso() + quantidadeDeComida);
        setComidaConsumida(getComidaConsumida() + quantidadeDeComida); //aumenta o peso do cachorro ao comer
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        setPeso(getPeso() - (distanciaPercorrida * 0.05)); //reduz o peso do cachorro ao se mover 
    }
    
    
}
