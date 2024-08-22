public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeDeNadadeiras) {
        super(nome, idade, peso, altura, quantidadeDeNadadeiras);
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
        setPeso(getPeso() - (distanciaPercorrida * 0.01));
    }

    
}
