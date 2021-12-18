package Animal;

public class Animal {
    protected String nome, cor, ambiente;
    protected double comprimento, velocidade;
    protected int nr_patas;


    public Animal() {
    }   

    public Animal(String nome, String cor, String ambiente, double comprimento, double velocidade, int nr_patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.nr_patas = nr_patas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getNr_patas() {
        return this.nr_patas;
    }

    public void setNr_patas(int nr_patas) {
        this.nr_patas = nr_patas;
    }

    public void dados() {
        System.out.println("Dados:\nNome: " + getNome() + "\nComprimento: " + getComprimento() + "\nNumero de patas: "
                + getNr_patas() + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: "
                + getVelocidade());

    }

}
