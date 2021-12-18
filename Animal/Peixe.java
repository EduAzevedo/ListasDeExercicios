package Animal;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        super();
    }

    public Peixe(String nome, Double comprimento, int nr_patas, String cor, String ambiente, Double velocidade, String alimento, String caracteristicas) {
        super(nome, cor, ambiente, velocidade, comprimento, nr_patas);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void dadosPeixe() {
        dados();
        System.out.println("\n"+this.caracteristicas);
    }
}