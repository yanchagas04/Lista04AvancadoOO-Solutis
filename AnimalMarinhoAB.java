public abstract class AnimalMarinhoAB extends AnimalAB {
    private int quantidadeDeNadadeiras;

    public AnimalMarinhoAB(String nome, int idade, double peso, double altura, int quantidadeDeNadadeiras) {
        super(nome, idade, "Marinho", "Marinho", peso, altura);
        this.quantidadeDeNadadeiras = quantidadeDeNadadeiras;
    }

    public int getQuantidadeDeNadadeiras() {
        return quantidadeDeNadadeiras;
    }

    public void setQuantidadeDeNadadeiras(int quantidadeDeNadadeiras) {
        this.quantidadeDeNadadeiras = quantidadeDeNadadeiras;
    }

    
}
