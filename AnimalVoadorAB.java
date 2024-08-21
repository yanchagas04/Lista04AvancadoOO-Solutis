public abstract class AnimalVoadorAB extends AnimalAB {
    private int quantidadeDeAsas;
    private double envergaduraDasAsas;
    
    public AnimalVoadorAB(String nome, int idade, String habitat, double peso, double altura, int quantidadeDeAsas, double envergaduraDasAsas) {
        super(nome, idade, "Voador", habitat, peso, altura);
        this.quantidadeDeAsas = quantidadeDeAsas;
        this.envergaduraDasAsas = envergaduraDasAsas;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
    }

    public double getEnvergaduraDasAsas() {
        return envergaduraDasAsas;
    }

    public void setEnvergaduraDasAsas(double envergaduraDasAsas) {
        this.envergaduraDasAsas = envergaduraDasAsas;
    }

    
}
