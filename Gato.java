public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer(int quantidadeDeComida) {
        setComidaConsumida(quantidadeDeComida);
        setPeso(getPeso() + quantidadeDeComida); //aumenta o peso do gato ao comer
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(horasDormidas);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        setPeso(getPeso() - (distanciaPercorrida * 0.04)); //reduz o peso do gato ao se mover
    }

    
}
