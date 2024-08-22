public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer(int quantidadeDeComida) {
        setComidaConsumida(getComidaConsumida() + quantidadeDeComida);
        setPeso(getPeso() + quantidadeDeComida);
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(horasDormidas);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        setPeso(getPeso() - (distanciaPercorrida * 0.25));
    }

    
}
