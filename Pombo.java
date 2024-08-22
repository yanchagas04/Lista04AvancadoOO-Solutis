public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeDeAsas, double envergaduraDasAsas) {
        super(nome, idade, habitat, peso, altura, quantidadeDeAsas, envergaduraDasAsas);
    }

    @Override
    public void comer(int quantidadeDeComida) {
        setComidaConsumida(getComidaConsumida() + quantidadeDeComida);
        setPeso(getPeso() + quantidadeDeComida);
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        setPeso(getPeso() - (distanciaPercorrida * 0.01));
    }

    
}
