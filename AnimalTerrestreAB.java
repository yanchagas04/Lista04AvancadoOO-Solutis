public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantidadeDePatas;

    public AnimalTerrestreAB(String nome, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, idade, "Terreste", habitat, peso, altura);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public int getQuantidaDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidaDePatas(int quantidaDePatas) {
        this.quantidadeDePatas = quantidaDePatas;
    }
    
    
}
