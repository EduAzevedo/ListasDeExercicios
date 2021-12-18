package Animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
    }


    public Mamifero(String nome, String cor, int nr_patas, String ambiente, Double comprimento, Double velocidade, String alimento) {
        super(nome, cor, ambiente, comprimento, velocidade, nr_patas);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        dados();
        System.out.println("Alimento: "+this.alimento);
    }
}