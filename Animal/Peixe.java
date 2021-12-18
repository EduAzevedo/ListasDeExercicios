package Animal;

public class Peixe {
    private Long caracteristicas;
    Animal peixe = new Animal();

    public Peixe() {
    }

    public Peixe(Long caracteristicas, String nome, Double comprimento, int Nr_patas, String cor, Double velocidade, String ambiente) {
        this.caracteristicas = caracteristicas;
        peixe.setNome(nome);
        peixe.setComprimento(comprimento);
        peixe.setNr_patas(Nr_patas);
        peixe.setCor(cor);
        peixe.setVelocidade(velocidade);
        peixe.setAmbiente(ambiente);
    }

    public Long getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(Long caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


    public void dadosPeixe() {
        peixe.dados();
        System.out.println("\n"+this.caracteristicas);
    }
}