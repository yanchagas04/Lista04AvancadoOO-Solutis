public abstract class AnimalAB implements AnimalIF {
    private String nome;
    private int idade;
    private String tipoAnimal;
    private String habitat;
    private double peso;
    private double altura;
    private int comidaConsumida;
    private int horasDormidas;
    private double distanciaPercorrida;
    
    public AnimalAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
        this.comidaConsumida = 0;
        this.horasDormidas = 0;
        this.distanciaPercorrida = 0;
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



    public int getComidaConsumida() {
        return comidaConsumida;
    }



    public void setComidaConsumida(int comidaConsumida) {
        this.comidaConsumida = comidaConsumida;
    }



    public int getHorasDormidas() {
        return horasDormidas;
    }



    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }



    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }



    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

}
