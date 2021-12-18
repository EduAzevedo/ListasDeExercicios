package Animal;

public class Mamifero {
    private String alimento;
    Animal pet = new Animal();

    public Mamifero() {
    }


    public Mamifero(String alimento, String nome, Double comprimento, int Nr_patas, String cor, Double velocidade, String ambiente) {
        this.alimento = alimento;
        pet.setNome(nome);
        pet.setComprimento(comprimento);
        pet.setNr_patas(Nr_patas);
        pet.setCor(cor);
        pet.setVelocidade(velocidade);
        pet.setAmbiente(ambiente);
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        pet.dados();
        System.out.println("\nAlimento: "+this.alimento);
    }
}