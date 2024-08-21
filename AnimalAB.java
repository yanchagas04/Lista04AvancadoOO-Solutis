public abstract class AnimalAB implements AnimalIF {
    private String nome;
    private int idade;
    private String tipoAnimal;
    private String habitat;
    private double peso;
    private double altura;
    
    public AnimalAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
    }

    

    @Override
    public void comer(int quantidadeDeComida) {
        
    }
    @Override
    public void moverse(double distanciaPercorrida){

    }
    @Override
    public void dormir(int horasDormidas){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
